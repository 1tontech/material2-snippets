package in.oneton.snippet.util.readme

import org.apache.commons.io.IOUtils

import static in.oneton.snippet.util.Util.*
import static java.nio.charset.Charset.defaultCharset

class ReadmeGenerator {

    void generate(File saveTo, boolean targetsVscode, String version) {
        String snippetsPath = '../snippets'

        StringWriter readmeContentWriter = new StringWriter()
        IOUtils.copy(getClass().getResourceAsStream("/readme-template.md"), readmeContentWriter, defaultCharset())
        String readmeContent = readmeContentWriter.toString()

        readmeContent = replacePlaceholderWithSnippets(readmeContent, /@@@GENERATED_MATERIAL_SNIPPETS@@@/, getSnippetResources("${snippetsPath}/material"), false, 'mat')
        readmeContent = replacePlaceholderWithSnippets(readmeContent, /@@@GENERATED_COVALENT_SNIPPETS@@@/, getSnippetResources("${snippetsPath}/covalent"), false, 'td')
        readmeContent = replacePlaceholderWithSnippets(readmeContent, /@@@GENERATED_FLEX_SNIPPETS@@@/, getSnippetResources("${snippetsPath}/flex-layout"), true, 'fx')

        if (targetsVscode) {
            readmeContent = readmeContent.replaceAll(/help\.gif/, "https://github.com/1tontech/material2-snippets/raw/vscode-${version}/vscode/help.gif")

            def codepointsRowsAsText = new File("${snippetsPath}/material/codepoints").text
            def codepoints = []
            codepointsRowsAsText.eachLine {
                codepoints << "${it.split(/\s/)[0]}"
            }

            StringBuilder builder = new StringBuilder()
            builder << "\n"
            builder << "Trigger | Description\n"
            builder << "--- | ---\n"

            codepoints.forEach({ codepoint ->
                builder << "mi-**${codepoint}** | ${codepoint}\n"
            })
            readmeContent = readmeContent.replaceAll(/@@@GENERATED_MATERIAL_ICON_SNIPPETS@@@/, builder.toString())
        }

        saveTo.text = readmeContent
        println "Regenerated readme file. Saved to ${saveTo.absolutePath}"
    }

    String replacePlaceholderWithSnippets(String readmeContent, String placeholderToReplace, List<File> snippetResources, boolean skipParentDirNameFromTrigger, String prefix) {
        Map<String, List<SnippetHelp>> folderToSnippets = new LinkedHashMap<>()
        snippetResources.each { snippetResource ->
            def fileBaseName = snippetResource.name.take(snippetResource.name.lastIndexOf('.'))
            String parentDirName = snippetResource.parent.substring(snippetResource.parent.lastIndexOf('/') + 1)
            def sectionName = parentDirName.replaceAll(/-/, ' ').capitalize()

            def snippetHelpBuilder = SnippetHelp.builder()
                    .description(nameToDescription(sectionName, fileBaseName))

            def triggerNameDetail = triggerName(prefix, parentDirName, fileBaseName, skipParentDirNameFromTrigger)
            snippetHelpBuilder.trigger("${triggerNameDetail.computedPrefix}**${(triggerNameDetail.name - triggerNameDetail.computedPrefix).replaceAll('\\*', '\\\\\\\\*')}**")

            List<SnippetHelp> helps = folderToSnippets.get(sectionName)
            if (!helps) {
                helps = new ArrayList<>()
            }
            helps.add(snippetHelpBuilder.build())
            folderToSnippets.put(sectionName, helps)
        }

        StringBuilder builder = new StringBuilder()

        folderToSnippets.forEach({ String folderName, List<SnippetHelp> snippetHelps ->
            builder << "\n"
            builder << "#### ${folderName}\n\n"
            builder << "Trigger | Description\n"
            builder << "--- | ---\n"
            snippetHelps.forEach({snippetHelp ->
                builder << "${snippetHelp}\n"
            })
        })

        readmeContent.replaceAll(placeholderToReplace, builder.toString().replace('\$', '\\$'))
    }

}
