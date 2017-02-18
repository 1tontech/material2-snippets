package in.oneton.snippet.util.vscode

import groovy.transform.builder.Builder

@Builder
class Snippet {
    String prefix
    String body
    String description
    String scope
}
