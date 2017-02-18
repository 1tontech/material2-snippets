package in.oneton.snippet.util.vscode

import in.oneton.snippet.util.readme.ReadmeGenerator

import static java.nio.charset.Charset.defaultCharset
import static org.apache.commons.io.IOUtils.readLines

class RegeneratePlugin {
    static void main(String[] args) {
        String version = readLines(new FileInputStream(new File('.version')), defaultCharset()).get(0)

        new SnippetGenerator().generateAll()
        new ReadmeGenerator().generate(new File('README.md'), false, version)
        new PackageJsonGenerator().generate()
    }
}
