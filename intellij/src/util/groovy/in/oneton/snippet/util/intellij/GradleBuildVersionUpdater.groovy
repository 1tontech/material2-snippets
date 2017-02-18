package in.oneton.snippet.util.intellij

import static java.nio.charset.Charset.defaultCharset
import static org.apache.commons.io.IOUtils.readLines

class GradleBuildVersionUpdater {

    void generate() {
        def version = readLines(new FileInputStream(new File('.version')), defaultCharset()).get(0)
        File buildFile = new File('build.gradle')
        String updateBuildFileContent = buildFile.text.replaceAll(/version '\d+.\d+.\d+'/, "version '${version}'")
        buildFile.text = updateBuildFileContent
        println "Updated version within build.gradle"
    }

}
