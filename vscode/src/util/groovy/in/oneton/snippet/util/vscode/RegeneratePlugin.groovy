package in.oneton.snippet.util.vscode

import in.oneton.snippet.util.readme.ReadmeGenerator

class RegeneratePlugin {
    static void main(String[] args) {
        new SnippetGenerator().generateAll()
        new ReadmeGenerator().generate(new File('README.md'))
        new PackageJsonGenerator().generate()
    }
}
