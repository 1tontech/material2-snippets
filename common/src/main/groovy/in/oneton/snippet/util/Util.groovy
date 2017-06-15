package in.oneton.snippet.util

import java.nio.file.Files
import java.nio.file.Paths

import static java.util.stream.Collectors.toList
import static org.apache.commons.lang3.StringEscapeUtils.escapeXml11

final class Util {
    private Util() {
    }

    static List<File> getSnippetResources(String rootPath) {
        return Files.walk(Paths.get(rootPath))
                .filter({ path -> path.fileName ==~ /.*.html$/ })
                .sorted()
                .map({ path -> path.toFile() })
                .collect(toList())
    }

    static CharSequence triggerName(CharSequence fileParent, CharSequence fileBaseName, boolean skipParentDirNameFromTrigger = false) {
        if (skipParentDirNameFromTrigger) {
            return fileBaseName
        } else {
            return fileParent + (fileBaseName ? ((fileBaseName ==~ /^:.+$/ || fileBaseName ==~ /^\$.*$/) ? fileBaseName : '-' + fileBaseName) : '')
        }
    }

    static CharSequence nameToDescription(CharSequence fileParent, CharSequence fileBaseName) {
        def description = (fileBaseName ==~ /^:.*$/  || fileBaseName ==~ /^\$.*$/) ? "${fileParent}${fileBaseName}".trim() : "${fileParent}-${fileBaseName}".trim()
        if (description ==~ /.*\+.*/) {
            description = description.replaceAll(/\+/, ' with responsive variations')
        }
        if (description ==~ /^.*:\*\*$/) {
            description = description.replaceAll(/:\*\*/, ' + more variations')
        }
        if (description ==~ /^.*:\?$/) {
            description = description.replaceAll(/:\?/, ' help')
        }
        if (description ==~ /^.*-\*.*$/) {
            description = description.replaceAll(/-\*/, ' *forEach flavor')
        }
        if (description ==~ /^.*@.*$/) {
            description = description.replaceAll(/@/, 'attribute directive ')
        }
        if (description ==~ /^.*_([^\W]+?)?\b.*$/) {
            description = description.replaceAll(/_([^\W]+?)?\b/, /$1 snippet/)
        }
        if (description ==~ /^.*:([a-z ]+)$/) {
            description = description.replaceAll(/:([a-z ]+)$/, / + $1 variation/)
        }
        if (description ==~ /.*-a\b.*/) {
            description = description.replaceAll(/-a\b/, ' with link')
        }
        if (fileBaseName ==~ /^\$.*/) {
            description = 'Reactive form variation of ' + description.replaceAll(/\$/, '')
        } else if (description ==~ /.*\$.*/) {
            description = description.replaceAll(/\$/, ' with observable variation')
        }
        escapeXml11(description.replace(/-/, ' ')).trim()
    }
}
