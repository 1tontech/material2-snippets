package in.oneton.snippet.util.intellij

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import groovy.transform.builder.Builder
import in.oneton.snippet.util.Match

import static java.lang.String.valueOf

@Builder
class Template {
    @JacksonXmlProperty(isAttribute = true)
    String name
    @JacksonXmlProperty(isAttribute = true)
    String value
    @JacksonXmlProperty(isAttribute = true)
    String description
    @JacksonXmlProperty(isAttribute = true)
    boolean toReformat

    @JacksonXmlProperty(localName = "variable")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<TemplateVariable> variables

    @JacksonXmlElementWrapper(localName = "context", useWrapping = true)
    @JacksonXmlProperty(localName = "option")
    List<ContextOption> options
}

@Builder
class TemplateVariable {
    @JacksonXmlProperty(isAttribute = true)
    String name
    @JacksonXmlProperty(isAttribute = true)
    String expression
    @JacksonXmlProperty(isAttribute = true)
    String defaultValue
    @JacksonXmlProperty(isAttribute = true)
    boolean alwaysStopAt

    static TemplateVariable from(Match match, String codePointVarString) {
        def builder = builder()
                .name(valueOf(match.index))
                .alwaysStopAt(true)
        String suggestion = match.suggestion
        if (suggestion) {
            suggestion = suggestion.replaceAll(/"/, /\\"/)
            if (suggestion.contains("|")) {
                def parts = suggestion.split(/\|/)
                def expression = 'enum(' + parts.collect { "\"$it\"" }.join(',') + ')'
                builder.expression("${expression}")
            } else {
                if (suggestion == 'ligature') {
                    builder.expression("$codePointVarString")
                } else {
                    builder.expression("\"$suggestion\"")
                }
            }
        }
        return builder.build()
    }
}

@Builder
class ContextOption {

    static final List<ContextOption> ALL = Collections.unmodifiableList(Arrays.asList(
            builder().name("HTML_TEXT").value(true).build(),
            builder().name("HTML").value(true).build(),
            builder().name("PHP").value(true).build(),
            builder().name("GSP").value(true).build(),
            builder().name("JSP").value(true).build(),
            builder().name("JSX_HTML").value(true).build()
    ))

    @JacksonXmlProperty(isAttribute = true)
    String name
    @JacksonXmlProperty(isAttribute = true)
    boolean value
}
