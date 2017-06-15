IntelliJ plugin/extension containing snippets/templates for Angular Material 2,  Flex layout 1, Teradata Covalent 1 & Material icons
============================================================================================================================================

This plugin is compatible with the following JetBrains products:

- IntelliJ IDEA
- WebStorm and PhpStorm
- PyCharm
- RubyMine

![Plugin in action](help.gif)

The detailed list of supported template triggers are listed [below](#documentation)

Feel free to let me know what else you want added via the [issues](https://github.com/1tontech/material2-snippets/issues)

Suggestions, feedback and other comments welcome via [@1tontech](https://twitter.com/1tontech) on Twitter.

## Usage

Create a new HTML document and

1. Type `md-` followed by pressing `Ctrl+Space` to see all available angular material snippets.
2. Type `td-` followed by pressing `Ctrl+Space` to see all available teradata covalent snippets.
3. Type `@fx` followed by pressing `Ctrl+Space` to see all available angular flex layout snippets.

Alternatively you can type `autocomplete` followed by `Ctrl+J` to see the snippet matches

Here are the conventions that will make it easy to lookup templates

1. If a tag supports multiple children, the template trigger version with `*` implies the template uses dynamic number of children `*ngFor` variation. The `*` comes from `*ngFor`
2. If a template trigger has `$` variation, this snippet gives you the reactive variation of an input component (or) observable variation if not an input. `$` comes from the fact each reactive component acts as observable source & observable variable names usually end with a `$`)
3. If a template trigger has `@` variation, this snippet targets the attribute of an html element in your markup. Think of `@` as `html attribute`
4. If a template trigger has `:**` variation, this means this variation contains the maximum number of options for that component. `**` comes from [ant](https://ant.apache.org/manual/dirtasks.html) which matches all the files under folder & sub folders
5. If a template trigger has `_`(underscore) variation, this is a snippet(partial) that can be added to the component. This exists mainly to avoid creating variations of all permutations for the base component
6. If a template trigger has `+` variation, this snippet allows you to specify responsive variation
7. If a template trigger has `:?` variation, the template contains additional help that helps you completely utilize the existing templates

## Mind map
1. `*` => `*ngFor` variation
2. `$` => Reactive version of input (or) Observable variation if component is not an input
3. `@` => Targets html attribute
4. `:**` => maximum variations
5. `_` => Html snippet
6. `+` => Responsive variations
7. `:?` => Help

## Installation (in 3 easy steps)

To install the plugin open your editor (IntelliJ) and hit:

1. `File > Settings > Plugins` and click on the `Browse repositories` button.
2. Look for `Angular material` the right click and select `Download plugin`.
3. Finally hit the `Apply` button, agree to restart your IDE and you're all done!

## Contribution guidelines

1. Clone this repo
2. To modify material templates, you can find the templates for each snippet under `snippets/material`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
3. To modify covalent templates, you can find the templates for each snippet under `snippets/covalent`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
3. To modify flex layout templates, you can find the templates for each snippet under `snippets/flex-layout`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
4. To modify material icon templates, you can update `codepoints` under `snippets/material`. Latest version of code points can be found [here](https://raw.githubusercontent.com/google/material-design-icons/master/iconfont/codepoints)
5. If you need to change `README.md` (or) `plugin.xml`, you should modify their templates (which are used to generate the actual files) under `src/util/resources`. For eg., If you want `plugin.xml` within plugin to be modified, you should change `plugin-template.xml` under `src/util/resources`. A new `plugin.xml` & `README.md` are regenerated for every build from their corresponding templates.
7. Send me a pull request

## Changelog

See [here](CHANGELOG.md)

## Documentation

Here are available live templates

### Angular material snippets

#### Autocomplete

Trigger | Description
--- | ---
md-**autocomplete$** | Reactive form variation of Autocomplete
md-**autocomplete** | Autocomplete

#### Button toggle

Trigger | Description
--- | ---
md-**button-toggle$-group-\*** | Reactive form variation of Button toggle group *forEach flavor
md-**button-toggle$-group** | Reactive form variation of Button toggle group
md-**button-toggle$** | Reactive form variation of Button toggle
md-**button-toggle** | Button toggle
md-**button-toggle-group-\*** | Button toggle group *forEach flavor
md-**button-toggle-group** | Button toggle group

#### Button

Trigger | Description
--- | ---
md-**button** | Button
md-**button:color** | Button + color variation
md-**button-a** | Button with link
md-**button-a:color** | Button with link + color variation
md-**button-fab-a** | Button fab with link
md-**button-fab-a:color** | Button fab with link + color variation
md-**button-fab** | Button fab
md-**button-fab:color** | Button fab + color variation
md-**button-icon-a** | Button icon with link
md-**button-icon-a:color** | Button icon with link + color variation
md-**button-icon** | Button icon
md-**button-icon:color** | Button icon + color variation
md-**button-mini-fab-a** | Button mini fab with link
md-**button-mini-fab-a:color** | Button mini fab with link + color variation
md-**button-mini-fab** | Button mini fab
md-**button-mini-fab:color** | Button mini fab + color variation
md-**button-raised-a** | Button raised with link
md-**button-raised-a:color** | Button raised with link + color variation
md-**button-raised** | Button raised
md-**button-raised:color** | Button raised + color variation

#### Card

Trigger | Description
--- | ---
md-**card** | Card
md-**card:avatar** | Card + avatar variation
md-**card:title-group** | Card:title group

#### Checkbox

Trigger | Description
--- | ---
md-**checkbox$** | Reactive form variation of Checkbox
md-**checkbox$:\*\*** | Reactive form variation of Checkbox + more variations
md-**checkbox** | Checkbox
md-**checkbox:\*\*** | Checkbox + more variations

#### Chip

Trigger | Description
--- | ---
md-**chip-\*** | Chip *forEach flavor
md-**chip-\*:color** | Chip *forEach flavor + color variation
md-**chip** | Chip
md-**chip:color** | Chip + color variation
md-**chip-basic** | Chip basic

#### Datepicker

Trigger | Description
--- | ---
md-**datepicker$-minmax** | Reactive form variation of Datepicker minmax
md-**datepicker$** | Reactive form variation of Datepicker
md-**datepicker$:\*\*** | Reactive form variation of Datepicker + more variations
md-**datepicker** | Datepicker
md-**datepicker:\*\*** | Datepicker + more variations
md-**datepicker-minmax** | Datepicker minmax

#### Dialog

Trigger | Description
--- | ---
md-**dialog** | Dialog
md-**dialog:\*\*** | Dialog + more variations
md-**dialog:?** | Dialog help

#### Divider

Trigger | Description
--- | ---
md-**divider** | Divider
md-**divider:inset** | Divider + inset variation

#### Grid

Trigger | Description
--- | ---
md-**grid-fit-\*** | Grid fit *forEach flavor
md-**grid-fit-\*:footer** | Grid fit *forEach flavor + footer variation
md-**grid-fit-\*:header** | Grid fit *forEach flavor + header variation
md-**grid-fit** | Grid fit
md-**grid-fit:footer** | Grid fit + footer variation
md-**grid-fit:header** | Grid fit + header variation
md-**grid-fixed-\*** | Grid fixed *forEach flavor
md-**grid-fixed-\*:footer** | Grid fixed *forEach flavor + footer variation
md-**grid-fixed-\*:header** | Grid fixed *forEach flavor + header variation
md-**grid-fixed** | Grid fixed
md-**grid-fixed:footer** | Grid fixed + footer variation
md-**grid-fixed:header** | Grid fixed + header variation
md-**grid-ratio-\*** | Grid ratio *forEach flavor
md-**grid-ratio-\*:footer** | Grid ratio *forEach flavor + footer variation
md-**grid-ratio-\*:header** | Grid ratio *forEach flavor + header variation
md-**grid-ratio** | Grid ratio
md-**grid-ratio:footer** | Grid ratio + footer variation
md-**grid-ratio:header** | Grid ratio + header variation

#### Icon

Trigger | Description
--- | ---
md-**icon** | Icon
md-**icon:color** | Icon + color variation
md-**icon-font** | Icon font
md-**icon-svg-set** | Icon svg set
md-**icon-svg** | Icon svg

#### Input

Trigger | Description
--- | ---
md-**input$-counting** | Reactive form variation of Input counting
md-**input$-prefix** | Reactive form variation of Input prefix
md-**input$-sufix** | Reactive form variation of Input sufix
md-**input$-textarea-auto-expand** | Reactive form variation of Input textarea auto expand
md-**input$-textarea-counting** | Reactive form variation of Input textarea counting
md-**input$-textarea-prefix** | Reactive form variation of Input textarea prefix
md-**input$-textarea-sufix** | Reactive form variation of Input textarea sufix
md-**input$-textarea** | Reactive form variation of Input textarea
md-**input$-textarea:\*** | Reactive form variation of Input textarea:*
md-**input$-textarea:color** | Reactive form variation of Input textarea + color variation
md-**input$** | Reactive form variation of Input
md-**input$:\*\*** | Reactive form variation of Input + more variations
md-**input$:color** | Reactive form variation of Input + color variation
md-**input** | Input
md-**input:\*\*** | Input + more variations
md-**input:color** | Input + color variation
md-**input-counting** | Input counting
md-**input-prefix** | Input prefix
md-**input-sufix** | Input sufix
md-**input-textarea-auto-expand** | Input textarea auto expand
md-**input-textarea-counting** | Input textarea counting
md-**input-textarea-prefix** | Input textarea prefix
md-**input-textarea-sufix** | Input textarea sufix
md-**input-textarea** | Input textarea
md-**input-textarea:\*** | Input textarea:*
md-**input-textarea:color** | Input textarea + color variation

#### List

Trigger | Description
--- | ---
md-**list-\*** | List *forEach flavor
md-**list** | List
md-**list:\*\*** | List + more variations
md-**list-_avatar** | List avatar snippet
md-**list-_header** | List header snippet
md-**list-_icon** | List icon snippet
md-**list-_icon:color** | List icon snippet + color variation
md-**list-_line** | List line snippet
md-**list-_line:a** | List line snippet + a variation
md-**list-nav-\*** | List nav *forEach flavor
md-**list-nav-complex-\*** | List nav complex *forEach flavor
md-**list-nav-complex** | List nav complex
md-**list-nav** | List nav
md-**list-nav:\*\*** | List nav + more variations

#### Menu

Trigger | Description
--- | ---
md-**menu-\*** | Menu *forEach flavor
md-**menu-\*:\*\*** | Menu *forEach flavor + more variations
md-**menu** | Menu
md-**menu:\*\*** | Menu + more variations
md-**menu:?** | Menu help
md-**menu-a-\*** | Menu with link *forEach flavor
md-**menu-a-\*:\*\*** | Menu with link *forEach flavor + more variations
md-**menu-a** | Menu with link
md-**menu-a:\*\*** | Menu with link + more variations

#### Progress bar

Trigger | Description
--- | ---
md-**progress-bar-buffer** | Progress bar buffer
md-**progress-bar-determinate** | Progress bar determinate
md-**progress-bar-indeterminate** | Progress bar indeterminate
md-**progress-bar-query** | Progress bar query

#### Progress spinner

Trigger | Description
--- | ---
md-**progress-spinner-determinate** | Progress spinner determinate
md-**progress-spinner-determinate:\*\*** | Progress spinner determinate + more variations
md-**progress-spinner-indeterminate** | Progress spinner indeterminate
md-**progress-spinner-indeterminate:\*\*** | Progress spinner indeterminate + more variations

#### Radio

Trigger | Description
--- | ---
md-**radio$-group-\*** | Reactive form variation of Radio group *forEach flavor
md-**radio$-group** | Reactive form variation of Radio group
md-**radio$** | Reactive form variation of Radio
md-**radio** | Radio
md-**radio-group-\*** | Radio group *forEach flavor
md-**radio-group** | Radio group

#### Ripple

Trigger | Description
--- | ---
md-**ripple-@disable** | Ripple attribute directive disable

#### Select

Trigger | Description
--- | ---
md-**select$-\*** | Reactive form variation of Select *forEach flavor
md-**select$-\*:\*\*** | Reactive form variation of Select *forEach flavor + more variations
md-**select$-multiple-\*** | Reactive form variation of Select multiple *forEach flavor
md-**select$-multiple-\*:\*\*** | Reactive form variation of Select multiple *forEach flavor + more variations
md-**select$-multiple** | Reactive form variation of Select multiple
md-**select$-optgroups-\*** | Reactive form variation of Select optgroups *forEach flavor
md-**select$-optgroups-\*:\*\*** | Reactive form variation of Select optgroups *forEach flavor + more variations
md-**select$** | Reactive form variation of Select
md-**select-\*** | Select *forEach flavor
md-**select-\*:\*\*** | Select *forEach flavor + more variations
md-**select** | Select
md-**select-multiple-\*** | Select multiple *forEach flavor
md-**select-multiple-\*:\*\*** | Select multiple *forEach flavor + more variations
md-**select-multiple** | Select multiple
md-**select-optgroups-\*** | Select optgroups *forEach flavor
md-**select-optgroups-\*:\*\*** | Select optgroups *forEach flavor + more variations

#### Sidenav

Trigger | Description
--- | ---
md-**sidenav** | Sidenav
md-**sidenav:\*\*** | Sidenav + more variations
md-**sidenav:both** | Sidenav + both variation
md-**sidenav-fab** | Sidenav fab
md-**sidenav-fab:\*\*** | Sidenav fab + more variations
md-**sidenav-fab:both** | Sidenav fab + both variation

#### Slide toggle

Trigger | Description
--- | ---
md-**slide-toggle$** | Reactive form variation of Slide toggle
md-**slide-toggle** | Slide toggle

#### Slider

Trigger | Description
--- | ---
md-**slider$** | Reactive form variation of Slider
md-**slider$:\*\*** | Reactive form variation of Slider + more variations
md-**slider** | Slider
md-**slider:\*\*** | Slider + more variations

#### Tab

Trigger | Description
--- | ---
md-**tab-\*** | Tab *forEach flavor
md-**tab** | Tab
md-**tab-nav-\*** | Tab nav *forEach flavor
md-**tab-nav** | Tab nav
md-**tab-rich-\*** | Tab rich *forEach flavor
md-**tab-rich** | Tab rich

#### Toolbar

Trigger | Description
--- | ---
md-**toolbar** | Toolbar
md-**toolbar:color** | Toolbar + color variation
md-**toolbar-rows** | Toolbar rows
md-**toolbar-rows:color** | Toolbar rows + color variation

#### Tooltip

Trigger | Description
--- | ---
md-**tooltip-@** | Tooltip attribute directive
md-**tooltip-@:\*\*** | Tooltip attribute directive  + more variations


### Angular flex layout snippets

#### Flex layout

Trigger | Description
--- | ---
@fx**Class** | Flex layout attribute directive fxClass
@fx**Flex+** | Flex layout attribute directive fxFlex with responsive variations
@fx**Flex+:\*\*** | Flex layout attribute directive fxFlex with responsive variations + more variations
@fx**Flex** | Flex layout attribute directive fxFlex
@fx**Flex:\*\*** | Flex layout attribute directive fxFlex + more variations
@fx**FlexAlign+** | Flex layout attribute directive fxFlexAlign with responsive variations
@fx**FlexAlign** | Flex layout attribute directive fxFlexAlign
@fx**FlexFill+** | Flex layout attribute directive fxFlexFill with responsive variations
@fx**FlexFill** | Flex layout attribute directive fxFlexFill
@fx**FlexOffset+** | Flex layout attribute directive fxFlexOffset with responsive variations
@fx**FlexOffset** | Flex layout attribute directive fxFlexOffset
@fx**FlexOrder+** | Flex layout attribute directive fxFlexOrder with responsive variations
@fx**FlexOrder** | Flex layout attribute directive fxFlexOrder
@fx**Hide+** | Flex layout attribute directive fxHide with responsive variations
@fx**Hide** | Flex layout attribute directive fxHide
@fx**Layout+** | Flex layout attribute directive fxLayout with responsive variations
@fx**Layout+:\*\*** | Flex layout attribute directive fxLayout with responsive variations + more variations
@fx**Layout** | Flex layout attribute directive fxLayout
@fx**Layout:\*\*** | Flex layout attribute directive fxLayout + more variations
@fx**LayoutAlign+** | Flex layout attribute directive fxLayoutAlign with responsive variations
@fx**LayoutAlign** | Flex layout attribute directive fxLayoutAlign
@fx**LayoutGap+** | Flex layout attribute directive fxLayoutGap with responsive variations
@fx**LayoutGap** | Flex layout attribute directive fxLayoutGap
@fx**Show+** | Flex layout attribute directive fxShow with responsive variations
@fx**Show** | Flex layout attribute directive fxShow
@fx**Style** | Flex layout attribute directive fxStyle


### Teradata covalent snippets

#### Autocomplete chip

Trigger | Description
--- | ---
td-**autocomplete-chip$** | Reactive form variation of Autocomplete chip
td-**autocomplete-chip$:\*\*** | Reactive form variation of Autocomplete chip + more variations
td-**autocomplete-chip** | Autocomplete chip
td-**autocomplete-chip:\*\*** | Autocomplete chip + more variations
td-**autocomplete-chip-readonly** | Autocomplete chip readonly

#### Data table

Trigger | Description
--- | ---
td-**data-table-!sortable** | Data table !sortable
td-**data-table-!sortable:\*\*** | Data table !sortable + more variations
td-**data-table$-!sortable** | Reactive form variation of Data table !sortable
td-**data-table$-!sortable:\*\*** | Reactive form variation of Data table !sortable + more variations
td-**data-table$-sortable** | Reactive form variation of Data table sortable
td-**data-table$-sortable:\*\*** | Reactive form variation of Data table sortable + more variations
td-**data-table-@cell** | Data table attribute directive cell
td-**data-table-@column-!sortable:\*\*** | Data table attribute directive column !sortable + more variations
td-**data-table-@column-sortable:\*\*** | Data table attribute directive column sortable + more variations
td-**data-table-@row** | Data table attribute directive row
td-**data-table-@table** | Data table attribute directive table
td-**data-table-sortable** | Data table sortable
td-**data-table-sortable:\*\*** | Data table sortable + more variations

#### Directive

Trigger | Description
--- | ---
td-**directive-@autotrim** | Directive attribute directive autotrim
td-**directive-@faded** | Directive attribute directive faded
td-**directive-@media-toggle** | Directive attribute directive media toggle
td-**directive-@media-toggle:\*\*** | Directive attribute directive media toggle + more variations
td-**directive-@toggle** | Directive attribute directive toggle

#### Dynamic form

Trigger | Description
--- | ---
td-**dynamic-form** | Dynamic form

#### Expansion panel

Trigger | Description
--- | ---
td-**expansion-panel** | Expansion panel
td-**expansion-panel:\*\*** | Expansion panel + more variations
td-**expansion-panel-richheader** | Expansion panel richheader
td-**expansion-panel-richheader:\*\*** | Expansion panel richheader + more variations

#### File input

Trigger | Description
--- | ---
td-**file-input** | File input
td-**file-input:\*\*** | File input + more variations

#### File upload

Trigger | Description
--- | ---
td-**file-upload** | File upload
td-**file-upload:\*\*** | File upload + more variations
td-**file-upload:?** | File upload help
td-**file-upload-@drop** | File upload attribute directive drop
td-**file-upload-@select** | File upload attribute directive select

#### Json formatter

Trigger | Description
--- | ---
td-**json-formatter** | Json formatter

#### Layout

Trigger | Description
--- | ---
td-**layout** | Layout
td-**layout:\*\*** | Layout + more variations
td-**layout-card** | Layout card
td-**layout-card:\*\*** | Layout card + more variations
td-**layout-management-list$** | Layout management list with observable variation
td-**layout-management-list$:\*\*** | Layout management list with observable variation + more variations
td-**layout-management-list** | Layout management list
td-**layout-management-list:\*\*** | Layout management list + more variations
td-**layout-nav-list$** | Layout nav list with observable variation
td-**layout-nav-list$:\*\*** | Layout nav list with observable variation + more variations
td-**layout-nav-list** | Layout nav list
td-**layout-nav-list:\*\*** | Layout nav list + more variations
td-**layout-nav** | Layout nav
td-**layout-nav:\*\*** | Layout nav + more variations

#### Loading

Trigger | Description
--- | ---
td-**loading:?** | Loading help
td-**loading-determinate** | Loading determinate
td-**loading-determinate:\*\*** | Loading determinate + more variations
td-**loading-indeterminate** | Loading indeterminate
td-**loading-indeterminate:\*\*** | Loading indeterminate + more variations

#### Markdown

Trigger | Description
--- | ---
td-**markdown** | Markdown
td-**markdown-dynamic** | Markdown dynamic

#### Notification

Trigger | Description
--- | ---
td-**notification** | Notification
td-**notification-icon** | Notification icon

#### Paging

Trigger | Description
--- | ---
td-**paging** | Paging
td-**paging:\*\*** | Paging + more variations

#### Pipe

Trigger | Description
--- | ---
td-**pipe-bytes** | Pipe bytes
td-**pipe-bytes:\*\*** | Pipe bytes + more variations
td-**pipe-digits** | Pipe digits
td-**pipe-digits:\*\*** | Pipe digits + more variations
td-**pipe-time-ago** | Pipe time ago
td-**pipe-time-ago:\*\*** | Pipe time ago + more variations
td-**pipe-time-difference** | Pipe time difference
td-**pipe-time-difference:\*\*** | Pipe time difference + more variations
td-**pipe-truncate** | Pipe truncate
td-**pipe-truncate:\*\*** | Pipe truncate + more variations

#### Search

Trigger | Description
--- | ---
td-**search-box-debounce** | Search box debounce
td-**search-box-debounce:\*\*** | Search box debounce + more variations
td-**search-box-trigger** | Search box trigger
td-**search-box-trigger:\*\*** | Search box trigger + more variations
td-**search-input-debounce** | Search input debounce
td-**search-input-trigger** | Search input trigger

#### Stepper

Trigger | Description
--- | ---
td-**stepper** | Stepper
td-**stepper:\*\*** | Stepper + more variations
td-**stepper-_step** | Stepper step snippet
td-**stepper-_step:\*\*** | Stepper step snippet + more variations

#### Syntax highlight

Trigger | Description
--- | ---
td-**syntax-highlight** | Syntax highlight
td-**syntax-highlight-dynamic** | Syntax highlight dynamic


## License

Angular material v2, Teradata covalent v1, Angular flex layout v1 & Material icon - IntelliJ Plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

## Disclaimer:

Readme template for this plugin was initially borrowed from [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)
