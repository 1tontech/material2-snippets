package in.oneton.snippet.util.intellij

import in.oneton.snippet.util.readme.ReadmeGenerator

class RegeneratePlugin {
    static void main(String[] args) {
        new Generator().generateAll()
        new ReadmeGenerator().generate(new File('README.md'))
        new PluginXmlGenerator().generate()
        new GradleBuildVersionUpdater().generate()
    }
}
