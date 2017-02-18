package in.oneton.snippet.util.readme

import org.apache.commons.io.IOUtils

import static in.oneton.snippet.util.Util.*
import static java.nio.charset.Charset.defaultCharset

class ReadmeGenerator {

    void generate(File saveTo) {
        String snippetsPath = '../snippets'

        StringWriter readmeContentWriter = new StringWriter()
        IOUtils.copy(getClass().getResourceAsStream("/readme-template.md"), readmeContentWriter, defaultCharset())
        String readmeContent = readmeContentWriter.toString()

        readmeContent = replacePlaceholderWithSnippets(readmeContent, /@@@GENERATED_MATERIAL_SNIPPETS@@@/, getSnippetResources("${snippetsPath}/material"), false)
        readmeContent = replacePlaceholderWithSnippets(readmeContent, /@@@GENERATED_COVALENT_SNIPPETS@@@/, getSnippetResources("${snippetsPath}/covalent"), false)
        readmeContent = replacePlaceholderWithSnippets(readmeContent, /@@@GENERATED_FLEX_SNIPPETS@@@/, getSnippetResources("${snippetsPath}/flex-layout"), true)

        saveTo.text = readmeContent
        println "Regenerated readme file. Saved to ${saveTo.absolutePath}"
    }

    String replacePlaceholderWithSnippets(String readmeContent, String placeholderToReplace, List<File> snippetResources, boolean skipParentDirNameFromTrigger) {
        Map<String, List<SnippetHelp>> folderToSnippets = new LinkedHashMap<>()
        snippetResources.each { snippetResource ->
            def fileBaseName = snippetResource.name.take(snippetResource.name.lastIndexOf('.'))
            String parentDirName = snippetResource.parent.substring(snippetResource.parent.lastIndexOf('/') + 1)
            def sectionName = parentDirName.replaceAll(/-/, ' ').capitalize()

            def snippetHelp = SnippetHelp.builder()
                    .trigger(triggerName(parentDirName, fileBaseName, skipParentDirNameFromTrigger))
                    .description(nameToDescription(sectionName, fileBaseName))
                    .build()
            List<SnippetHelp> helps = folderToSnippets.get(sectionName)
            if (!helps) {
                helps = new ArrayList<>()
            }
            helps.add(snippetHelp)
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
