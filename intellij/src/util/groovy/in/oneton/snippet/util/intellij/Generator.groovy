package in.oneton.snippet.util.intellij

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import in.oneton.snippet.util.Match

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT
import static in.oneton.snippet.util.Util.getSnippetResources
import static in.oneton.snippet.util.Util.nameToDescription
import static in.oneton.snippet.util.Util.triggerName
import static java.util.regex.Pattern.compile
import static java.util.stream.Collectors.toList

class Generator {

    static LONG_FORM_PATTERN = compile(/\$\s*\{\s*(\d+)\s*:\s*([^}]*)\s*}/)
    static SHORT_FORM_PATTERN = compile(/\$\s*(\d+)/)

    void generateAll() {
        String resourcesPath = 'src/main/resources'
        String snippetsPath = '../snippets'

        new File(resourcesPath).mkdirs()

        def codepointsRowsAsText = new File("${snippetsPath}/material/codepoints").text
        def codepoints = []
        codepointsRowsAsText.eachLine {
            codepoints << "\"${it.split(/\s/)[0]}\""
        }

        def codePointVarString = "enum(${codepoints.join(',')})"

        GeneratorMetadata metadata = GeneratorMetadata.builder().templateRootPath("${snippetsPath}/material")
                .codePointVarString(codePointVarString)
                .triggerNameGenerator({ String fileParent, String fileBaseName -> triggerName('md', fileParent, fileBaseName).name })
                .descriptionGenerator({ String fileParent, String fileBaseName -> nameToDescription(fileParent, fileBaseName) })
                .groupName('Material')
                .snippetXmlPath("${resourcesPath}/material.xml")
                .build()
        File snippetXml = generateFromMetadata(metadata)
        println "Regenerated material template file. Saved to ${snippetXml.absolutePath}"

        metadata = GeneratorMetadata.builder().templateRootPath("${snippetsPath}/covalent")
                .codePointVarString(codePointVarString)
                .triggerNameGenerator({ String fileParent, String fileBaseName -> triggerName('td', fileParent, fileBaseName).name })
                .descriptionGenerator({ String fileParent, String fileBaseName -> nameToDescription(fileParent, fileBaseName) })
                .groupName('Covalent')
                .snippetXmlPath("${resourcesPath}/covalent.xml")
                .build()
        snippetXml = generateFromMetadata(metadata)
        println "Regenerated covalent template file. Saved to ${snippetXml.absolutePath}"

        metadata = GeneratorMetadata.builder().templateRootPath("${snippetsPath}/flex-layout")
                .codePointVarString(codePointVarString)
                .triggerNameGenerator({ String fileParent, String fileBaseName -> triggerName('fx', fileParent, fileBaseName, true).name })
                .descriptionGenerator({ String fileParent, String fileBaseName -> nameToDescription(fileParent, fileBaseName) })
                .groupName('Flex layout')
                .snippetXmlPath("${resourcesPath}/flex-layout.xml")
                .build()
        snippetXml = generateFromMetadata(metadata)
        println "Regenerated flex layout template file. Saved to ${snippetXml.absolutePath}"
    }

    private File generateFromMetadata(GeneratorMetadata metadata) {
        List<Template> templates = new ArrayList<>()

        getSnippetResources(metadata.templateRootPath).forEach({ File snippetResource ->
            def contentUntouched = snippetResource.text
            def fileParent = new File(snippetResource.parent).name
            def fileBaseName = snippetResource.name.take(snippetResource.name.lastIndexOf('.'))

            def templateStr = contentUntouched

            def matches = parseAndGetMatches(contentUntouched)
            def variables = matches.stream().map({ match ->
                templateStr = replaceWithVarFormat(templateStr, match.index)
                return TemplateVariable.from(match, metadata.codePointVarString)
            }).collect(toList())

            def template = Template.builder()
                    .name(metadata.triggerNameGenerator.transform(fileParent, fileBaseName).toString())
                    .value(templateStr.trim())
                    .description(metadata.descriptionGenerator.transform(fileParent, fileBaseName).toString())
                    .toReformat(true)
                    .variables(variables)
                    .options(ContextOption.ALL)
                    .build()

            templates.add(template)
        })
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(INDENT_OUTPUT);

        File file = new File(metadata.snippetXmlPath)
        TemplateSet templateSet = TemplateSet.builder().group(metadata.groupName)
                .templates(templates).build()
        xmlMapper.writeValue(file, templateSet)

        return file
    }

    private String replaceWithVarFormat(String text, int index) {
        String modifiedText = replaceWithVarFormat(text, index, true)
        if (modifiedText == text) {
            return replaceWithVarFormat(text, index, false)
        }
        return modifiedText
    }

    private String replaceWithVarFormat(String text, int index, boolean longForm) {
        if (longForm) {
            def pattern = compile(/\$\s*\{\s*/ + index + /\s*:\s*([^}]*)\s*}/)
            return text.replaceAll(pattern, /\$/ + index + /\$/)
        } else {
            def pattern = compile(/\$\s*/+index)
            return text.replaceAll(pattern, /\$/ + index + /\$/)
        }
    }

    private Set<Match> parseAndGetMatches(String text) {
        def matches = parseAndGetMatches(text, true)
        matches.addAll(parseAndGetMatches(text, false))
        return matches
    }

    private Set<Match> parseAndGetMatches(String text, boolean longForm) {
        Set<Match> matches = new TreeSet<>()
        if (longForm) {
            def matcher = LONG_FORM_PATTERN.matcher(text)
            while (matcher.find()) {
                def index = Integer.parseInt(matcher.group(1))
                def suggestion = matcher.group(2)
                matches << Match.builder().index(index).suggestion(suggestion).build()
            }
        } else {
            def matcher = SHORT_FORM_PATTERN.matcher(text)
            while (matcher.find()) {
                def index = Integer.parseInt(matcher.group(1))
                matches << Match.builder().index(index).build()
            }
        }
        return matches
    }
}
