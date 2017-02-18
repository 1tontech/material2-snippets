package in.oneton.snippet.util.vscode

import com.fasterxml.jackson.databind.ObjectMapper

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT
import static in.oneton.snippet.util.Util.getSnippetResources
import static in.oneton.snippet.util.Util.nameToDescription
import static in.oneton.snippet.util.Util.triggerName

class SnippetGenerator {

    void generateAll() {
        String snippetsPath = '../snippets'

        ObjectMapper mapper = new ObjectMapper()
        mapper.enable(INDENT_OUTPUT)
        Map<String, Snippet> descriptionToSnippet = new LinkedHashMap<>()

        GeneratorMetadata metadata = GeneratorMetadata.builder().templateRootPath("${snippetsPath}/material")
                .triggerNameGenerator({ String fileParent, String fileBaseName -> "md-${triggerName(fileParent, fileBaseName)}" })
                .descriptionGenerator({ String fileParent, String fileBaseName -> nameToDescription(fileParent, fileBaseName) })
                .build()
        generateFromMetadata(descriptionToSnippet, metadata)
        println "Processed material template files"

        metadata = GeneratorMetadata.builder().templateRootPath("${snippetsPath}/covalent")
                .triggerNameGenerator({ String fileParent, String fileBaseName -> "td-${triggerName(fileParent, fileBaseName)}" })
                .descriptionGenerator({ String fileParent, String fileBaseName -> nameToDescription(fileParent, fileBaseName) })
                .build()
        generateFromMetadata(descriptionToSnippet, metadata)
        println "Processed covalent template files"

        metadata = GeneratorMetadata.builder().templateRootPath("${snippetsPath}/flex-layout")
                .triggerNameGenerator({ String fileParent, String fileBaseName -> "@fx${fileBaseName - '@fx'}" })
                .descriptionGenerator({ String fileParent, String fileBaseName -> nameToDescription(fileParent, fileBaseName) })
                .build()
        generateFromMetadata(descriptionToSnippet, metadata)
        println "Processed flex layout template files"

        def codepointsRowsAsText = new File("${snippetsPath}/material/codepoints").text
        def codepoints = []
        codepointsRowsAsText.eachLine {
            codepoints << "\"${it.split(/\s/)[0]}\""
        }

        codepoints.forEach({ iconStr ->
            String triggerPattern = "^${iconStr}"
            String templateStr = "${iconStr}\$0"
            String helpMsg = iconStr

            def snippet = Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build()
            descriptionToSnippet.put(helpMsg, snippet)

            snippet = Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build()
            descriptionToSnippet.put(helpMsg, snippet)
        })

        File file = new File('snippets.json')
        mapper.writeValue(file, descriptionToSnippet)
        println "Regenerated snippets. Saved to ${file.absolutePath}"
    }

    private void generateFromMetadata(Map<String, Snippet> descriptionToSnippet, GeneratorMetadata metadata) {
        String templateStr
        String triggerPattern
        String helpMsg

        getSnippetResources(metadata.templateRootPath).forEach({ snippetResource ->
            String contentUntouched = snippetResource.text

            String fileParent = new File(snippetResource.parent).name
            String fileBaseName = snippetResource.name.take(snippetResource.name.lastIndexOf('.'))

            triggerPattern = metadata.triggerNameGenerator.transform(fileParent, fileBaseName)
            templateStr = contentUntouched.trim().replaceAll("\\\$END\\\$", '\\\$0')
            helpMsg = metadata.descriptionGenerator.transform(fileParent, fileBaseName)

            def snippet = Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build()
            descriptionToSnippet.put(helpMsg, snippet)
        })
    }

}
