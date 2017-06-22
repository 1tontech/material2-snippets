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

    static TriggerNameDetail triggerName(CharSequence prefix, CharSequence fileParent, CharSequence fileBaseName, boolean skipParentDirNameFromTrigger = false) {
        String computedPrefix
        String name
        if (skipParentDirNameFromTrigger) {
            if (fileBaseName.startsWith("@")) {
                computedPrefix = "@${prefix}"
                name = fileBaseName.startsWith("@${prefix}") ? fileBaseName : "@${prefix}${(fileBaseName - '@').capitalize()}"
            } else {
                computedPrefix = "${prefix}-"
                name = "${prefix}-${fileBaseName.capitalize()}"
            }
        } else {
            if (fileBaseName.startsWith("@")) {
                computedPrefix = "@${prefix}"
                name = "@${prefix}${fileParent.replaceAll(/-([a-z])/, {matchGroup -> matchGroup[1].toUpperCase() }).capitalize()}" + (fileBaseName ? (fileBaseName - '@').replaceAll(/-(!?)([a-z])/, {matchGroup ->  matchGroup[1] ?  '!' + matchGroup[2].toUpperCase() : matchGroup[2].toUpperCase() }).capitalize() : '')
            } else {
                def returnVal = fileParent + (fileBaseName ? ((fileBaseName ==~ /^:.+$/ || fileBaseName ==~ /^\$.*$/) ? fileBaseName : '-' + fileBaseName) : '')
                computedPrefix = "${prefix}-"
                name = "${prefix}-${returnVal}"
            }
        }
        return TriggerNameDetail.builder().name(name).computedPrefix(computedPrefix).build()
    }

    static CharSequence nameToDescription(CharSequence fileParent, CharSequence fileBaseName) {
        def description
        if ((fileBaseName ==~ /^:.*$/  || fileBaseName ==~ /^\$.*$/)) {
            description = "${fileParent}${fileBaseName}".trim()
        } else if (fileBaseName ==~ /^@.*$/) {
            description = "@ ${fileParent} ${fileBaseName - '@'}".trim()
        } else {
            description = "${fileParent}-${fileBaseName}".trim()
        }

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
