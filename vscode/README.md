Visual studio code (vscode) plugin/extension containing snippets for Angular Material 2, Angular Flex layout 1, Teradata Covalent 1 & Material icons
====================================================================================================================================================

This plugin works in both in the stable & the insiders build

![Plugin in action](https://github.com/1tontech/material2-snippets/raw/vscode-0.12.0/vscode/help.gif)

The detailed list of supported template triggers are listed [below](#documentation)

Feel free to let me know what else you want added via the [issues](https://github.com/1tontech/material2-snippets/issues)

Suggestions, feedback and other comments welcome via [@1tontech](https://twitter.com/1tontech) on Twitter.

## Usage


Create a new HTML document and

1. Type `mat-` for all material components. Use `@mat` for all material attribute directives. `mat` comes from `*mat*erial design`
2. Type `@fx` for all flex layout attribute directives. `fx` comes from `flex layout`
3. Type `td-` for all teradata covalent components. Use `@td` for all teradata covalent attribute directives. `td` comes from `tera data` which is the company responsible for covalent development. `td` is quite similar to `mat`

`Ctrl+Space` will trigger autocomplete dialog for snippet selection

> 1. For autocompletion of components, use hyphen `-` format. i.e for material button, type `mat-button`
> 2. For autocompletion of attribute directives, use `@` format. i.e for flex layout, use `@fxLayout` (or) use `@matTooltip` for material tooltip

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

## Installation (in 2 easy steps)

1. Install plugin
  1. Press `F1`, paste `ext install angular-material` & then press `enter` (or)
  2. Goto extensions by pressing `Ctrl-Shift-X` (Windows/Linux) or `Cmd-Shift-X` (Mac) & Search for `Angular material v2`, click on install
2. Reload your editor

You are good to go

## Contribution guidelines

1. Clone this repo
2. To modify material templates, you can find the templates for each snippet under `snippets/material`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
3. To modify covalent templates, you can find the templates for each snippet under `snippets/covalent`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
3. To modify flex layout templates, you can find the templates for each snippet under `snippets/flex-layout`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
5. If you need to change `README.md` (or) `package.json`, you should modify their templates (which are used to generate the actual files) under `src/util/resources`. For eg., If you want `package.json` within plugin to be modified, you should change `package-template.json` under `src/util/resources`. A new `package.json` & `README.md` are regenerated for every build from their corresponding templates.
6. Send me a pull request

## Changelog

See [here](CHANGELOG.md)

## Documentation
Here are available live templates

### Angular material snippets

#### Accordion

Trigger | Description
--- | ---
mat-**accordion** | Accordion
mat-**accordion-_expansion-panel-action** | Accordion expansion snippet panel action
mat-**accordion-_expansion-panel** | Accordion expansion snippet panel
mat-**accordion-_expansion-panel:action** | Accordion expansion snippet panel + action variation

#### Autocomplete

Trigger | Description
--- | ---
mat-**autocomplete$** | Reactive form variation of Autocomplete
mat-**autocomplete** | Autocomplete

#### Button toggle

Trigger | Description
--- | ---
mat-**button-toggle$-group-\*** | Reactive form variation of Button toggle group *forEach flavor
mat-**button-toggle$-group** | Reactive form variation of Button toggle group
mat-**button-toggle$** | Reactive form variation of Button toggle
mat-**button-toggle** | Button toggle
mat-**button-toggle-group-\*** | Button toggle group *forEach flavor
mat-**button-toggle-group** | Button toggle group

#### Button

Trigger | Description
--- | ---
mat-**button** | Button
mat-**button:color** | Button + color variation
mat-**button-a** | Button with link
mat-**button-a:color** | Button with link + color variation
mat-**button-fab-a** | Button fab with link
mat-**button-fab-a:color** | Button fab with link + color variation
mat-**button-fab** | Button fab
mat-**button-fab:color** | Button fab + color variation
mat-**button-icon-a** | Button icon with link
mat-**button-icon-a:color** | Button icon with link + color variation
mat-**button-icon** | Button icon
mat-**button-icon:color** | Button icon + color variation
mat-**button-mini-fab-a** | Button mini fab with link
mat-**button-mini-fab-a:color** | Button mini fab with link + color variation
mat-**button-mini-fab** | Button mini fab
mat-**button-mini-fab:color** | Button mini fab + color variation
mat-**button-raised-a** | Button raised with link
mat-**button-raised-a:color** | Button raised with link + color variation
mat-**button-raised** | Button raised
mat-**button-raised:color** | Button raised + color variation

#### Card

Trigger | Description
--- | ---
mat-**card** | Card
mat-**card:avatar** | Card + avatar variation
mat-**card:title-group** | Card:title group
@mat**CardAvatar** | attribute directive  Card avatar
@mat**CardImageLarge** | attribute directive  Card image large
@mat**CardImageMedium** | attribute directive  Card image medium
@mat**CardImageSmall** | attribute directive  Card image small
@mat**CardImageXLarge** | attribute directive  Card image x large
@mat**CardImage** | attribute directive  Card image
@mat**CardSubTitle** | attribute directive  Card sub title
@mat**CardTitle** | attribute directive  Card title

#### Checkbox

Trigger | Description
--- | ---
mat-**checkbox$** | Reactive form variation of Checkbox
mat-**checkbox$:\*\*** | Reactive form variation of Checkbox + more variations
mat-**checkbox** | Checkbox
mat-**checkbox:\*\*** | Checkbox + more variations

#### Chip

Trigger | Description
--- | ---
mat-**chip-\*** | Chip *forEach flavor
mat-**chip-\*:color** | Chip *forEach flavor + color variation
mat-**chip** | Chip
mat-**chip:color** | Chip + color variation
mat-**chip-basic** | Chip basic

#### Datepicker

Trigger | Description
--- | ---
mat-**datepicker$-minmax** | Reactive form variation of Datepicker minmax
mat-**datepicker$** | Reactive form variation of Datepicker
mat-**datepicker$:\*\*** | Reactive form variation of Datepicker + more variations
mat-**datepicker** | Datepicker
mat-**datepicker:\*\*** | Datepicker + more variations
mat-**datepicker-minmax** | Datepicker minmax

#### Dialog

Trigger | Description
--- | ---
mat-**dialog** | Dialog
mat-**dialog:\*\*** | Dialog + more variations
mat-**dialog:?** | Dialog help
@mat**DialogActions** | attribute directive  Dialog actions
@mat**DialogClose** | attribute directive  Dialog close
@mat**DialogContent** | attribute directive  Dialog content
@mat**DialogTitle** | attribute directive  Dialog title

#### Divider

Trigger | Description
--- | ---
mat-**divider** | Divider
mat-**divider:inset** | Divider + inset variation

#### Expansion

Trigger | Description
--- | ---
mat-**expansion** | Expansion
mat-**expansion:\*\*** | Expansion + more variations

#### Grid

Trigger | Description
--- | ---
mat-**grid-fit-\*** | Grid fit *forEach flavor
mat-**grid-fit-\*:footer** | Grid fit *forEach flavor + footer variation
mat-**grid-fit-\*:header** | Grid fit *forEach flavor + header variation
mat-**grid-fit** | Grid fit
mat-**grid-fit:footer** | Grid fit + footer variation
mat-**grid-fit:header** | Grid fit + header variation
mat-**grid-fixed-\*** | Grid fixed *forEach flavor
mat-**grid-fixed-\*:footer** | Grid fixed *forEach flavor + footer variation
mat-**grid-fixed-\*:header** | Grid fixed *forEach flavor + header variation
mat-**grid-fixed** | Grid fixed
mat-**grid-fixed:footer** | Grid fixed + footer variation
mat-**grid-fixed:header** | Grid fixed + header variation
mat-**grid-ratio-\*** | Grid ratio *forEach flavor
mat-**grid-ratio-\*:footer** | Grid ratio *forEach flavor + footer variation
mat-**grid-ratio-\*:header** | Grid ratio *forEach flavor + header variation
mat-**grid-ratio** | Grid ratio
mat-**grid-ratio:footer** | Grid ratio + footer variation
mat-**grid-ratio:header** | Grid ratio + header variation

#### Icon

Trigger | Description
--- | ---
mat-**icon** | Icon
mat-**icon:color** | Icon + color variation
mat-**icon-font** | Icon font
mat-**icon-svg-set** | Icon svg set
mat-**icon-svg** | Icon svg

#### Input

Trigger | Description
--- | ---
mat-**input$-counting** | Reactive form variation of Input counting
mat-**input$-prefix** | Reactive form variation of Input prefix
mat-**input$-sufix** | Reactive form variation of Input sufix
mat-**input$-textarea-auto-expand** | Reactive form variation of Input textarea auto expand
mat-**input$-textarea-counting** | Reactive form variation of Input textarea counting
mat-**input$-textarea-prefix** | Reactive form variation of Input textarea prefix
mat-**input$-textarea-sufix** | Reactive form variation of Input textarea sufix
mat-**input$-textarea** | Reactive form variation of Input textarea
mat-**input$-textarea:\*** | Reactive form variation of Input textarea:*
mat-**input$-textarea:color** | Reactive form variation of Input textarea + color variation
mat-**input$** | Reactive form variation of Input
mat-**input$:\*\*** | Reactive form variation of Input + more variations
mat-**input$:color** | Reactive form variation of Input + color variation
mat-**input** | Input
mat-**input:\*\*** | Input + more variations
mat-**input:color** | Input + color variation
mat-**input-_error** | Input error snippet
mat-**input-counting** | Input counting
mat-**input-prefix** | Input prefix
mat-**input-sufix** | Input sufix
mat-**input-textarea-auto-expand** | Input textarea auto expand
mat-**input-textarea-counting** | Input textarea counting
mat-**input-textarea-prefix** | Input textarea prefix
mat-**input-textarea-sufix** | Input textarea sufix
mat-**input-textarea** | Input textarea
mat-**input-textarea:\*** | Input textarea:*
mat-**input-textarea:color** | Input textarea + color variation

#### Line

Trigger | Description
--- | ---
@mat**Line** | attribute directive  Line

#### List

Trigger | Description
--- | ---
mat-**list-\*** | List *forEach flavor
mat-**list** | List
mat-**list:\*\*** | List + more variations
@mat**ListIcon** | attribute directive  List icon
mat-**list-_avatar** | List avatar snippet
mat-**list-_header** | List header snippet
mat-**list-_icon** | List icon snippet
mat-**list-_icon:color** | List icon snippet + color variation
mat-**list-_line** | List line snippet
mat-**list-_line:a** | List line snippet + a variation
mat-**list-nav-\*** | List nav *forEach flavor
mat-**list-nav-complex-\*** | List nav complex *forEach flavor
mat-**list-nav-complex** | List nav complex
mat-**list-nav** | List nav
mat-**list-nav:\*\*** | List nav + more variations

#### Menu

Trigger | Description
--- | ---
mat-**menu-\*** | Menu *forEach flavor
mat-**menu-\*:\*\*** | Menu *forEach flavor + more variations
mat-**menu** | Menu
mat-**menu:\*\*** | Menu + more variations
mat-**menu:?** | Menu help
mat-**menu-a-\*** | Menu with link *forEach flavor
mat-**menu-a-\*:\*\*** | Menu with link *forEach flavor + more variations
mat-**menu-a** | Menu with link
mat-**menu-a:\*\*** | Menu with link + more variations

#### Progress bar

Trigger | Description
--- | ---
mat-**progress-bar-buffer** | Progress bar buffer
mat-**progress-bar-determinate** | Progress bar determinate
mat-**progress-bar-indeterminate** | Progress bar indeterminate
mat-**progress-bar-query** | Progress bar query

#### Progress spinner

Trigger | Description
--- | ---
mat-**progress-spinner-determinate** | Progress spinner determinate
mat-**progress-spinner-determinate:\*\*** | Progress spinner determinate + more variations
mat-**progress-spinner-indeterminate** | Progress spinner indeterminate
mat-**progress-spinner-indeterminate:\*\*** | Progress spinner indeterminate + more variations

#### Radio

Trigger | Description
--- | ---
mat-**radio$-group-\*** | Reactive form variation of Radio group *forEach flavor
mat-**radio$-group** | Reactive form variation of Radio group
mat-**radio$** | Reactive form variation of Radio
mat-**radio** | Radio
mat-**radio-group-\*** | Radio group *forEach flavor
mat-**radio-group** | Radio group

#### Ripple

Trigger | Description
--- | ---
@mat**Ripple:disable** | attribute directive  Ripple  + disable variation

#### Select

Trigger | Description
--- | ---
mat-**select$-\*** | Reactive form variation of Select *forEach flavor
mat-**select$-\*:\*\*** | Reactive form variation of Select *forEach flavor + more variations
mat-**select$-multiple-\*** | Reactive form variation of Select multiple *forEach flavor
mat-**select$-multiple-\*:\*\*** | Reactive form variation of Select multiple *forEach flavor + more variations
mat-**select$-multiple** | Reactive form variation of Select multiple
mat-**select$-optgroups-\*** | Reactive form variation of Select optgroups *forEach flavor
mat-**select$-optgroups-\*:\*\*** | Reactive form variation of Select optgroups *forEach flavor + more variations
mat-**select$** | Reactive form variation of Select
mat-**select-\*** | Select *forEach flavor
mat-**select-\*:\*\*** | Select *forEach flavor + more variations
mat-**select** | Select
mat-**select-multiple-\*** | Select multiple *forEach flavor
mat-**select-multiple-\*:\*\*** | Select multiple *forEach flavor + more variations
mat-**select-multiple** | Select multiple
mat-**select-optgroups-\*** | Select optgroups *forEach flavor
mat-**select-optgroups-\*:\*\*** | Select optgroups *forEach flavor + more variations

#### Sidenav

Trigger | Description
--- | ---
mat-**sidenav** | Sidenav
mat-**sidenav:\*\*** | Sidenav + more variations
mat-**sidenav:both** | Sidenav + both variation
mat-**sidenav-fab** | Sidenav fab
mat-**sidenav-fab:\*\*** | Sidenav fab + more variations
mat-**sidenav-fab:both** | Sidenav fab + both variation

#### Slide toggle

Trigger | Description
--- | ---
mat-**slide-toggle$** | Reactive form variation of Slide toggle
mat-**slide-toggle** | Slide toggle

#### Slider

Trigger | Description
--- | ---
mat-**slider$** | Reactive form variation of Slider
mat-**slider$:\*\*** | Reactive form variation of Slider + more variations
mat-**slider** | Slider
mat-**slider:\*\*** | Slider + more variations

#### Tab

Trigger | Description
--- | ---
mat-**tab-\*** | Tab *forEach flavor
mat-**tab** | Tab
@mat**TabLabel** | attribute directive  Tab label
@mat**TabLink** | attribute directive  Tab link
mat-**tab-nav-\*** | Tab nav *forEach flavor
mat-**tab-nav** | Tab nav
mat-**tab-rich-\*** | Tab rich *forEach flavor
mat-**tab-rich** | Tab rich

#### Toolbar

Trigger | Description
--- | ---
mat-**toolbar** | Toolbar
mat-**toolbar:color** | Toolbar + color variation
mat-**toolbar-rows** | Toolbar rows
mat-**toolbar-rows:color** | Toolbar rows + color variation

#### Tooltip

Trigger | Description
--- | ---
@mat**Tooltip** | attribute directive  Tooltip
@mat**Tooltip:\*\*** | attribute directive  Tooltip  + more variations
@mat**TooltipClass** | attribute directive  Tooltip class
@mat**TooltipHideDelay** | attribute directive  Tooltip hide delay
@mat**TooltipPosition** | attribute directive  Tooltip position
@mat**TooltipShowDelay** | attribute directive  Tooltip show delay


### Angular flex layout snippets

#### Flex layout

Trigger | Description
--- | ---
@fx**Class** | attribute directive  Flex layout fxClass
@fx**Flex+** | attribute directive  Flex layout fxFlex with responsive variations
@fx**Flex+:\*\*** | attribute directive  Flex layout fxFlex with responsive variations + more variations
@fx**Flex** | attribute directive  Flex layout fxFlex
@fx**Flex:\*\*** | attribute directive  Flex layout fxFlex + more variations
@fx**FlexAlign+** | attribute directive  Flex layout fxFlexAlign with responsive variations
@fx**FlexAlign** | attribute directive  Flex layout fxFlexAlign
@fx**FlexFill+** | attribute directive  Flex layout fxFlexFill with responsive variations
@fx**FlexFill** | attribute directive  Flex layout fxFlexFill
@fx**FlexOffset+** | attribute directive  Flex layout fxFlexOffset with responsive variations
@fx**FlexOffset** | attribute directive  Flex layout fxFlexOffset
@fx**FlexOrder+** | attribute directive  Flex layout fxFlexOrder with responsive variations
@fx**FlexOrder** | attribute directive  Flex layout fxFlexOrder
@fx**Hide+** | attribute directive  Flex layout fxHide with responsive variations
@fx**Hide** | attribute directive  Flex layout fxHide
@fx**Layout+** | attribute directive  Flex layout fxLayout with responsive variations
@fx**Layout+:\*\*** | attribute directive  Flex layout fxLayout with responsive variations + more variations
@fx**Layout** | attribute directive  Flex layout fxLayout
@fx**Layout:\*\*** | attribute directive  Flex layout fxLayout + more variations
@fx**LayoutAlign+** | attribute directive  Flex layout fxLayoutAlign with responsive variations
@fx**LayoutAlign** | attribute directive  Flex layout fxLayoutAlign
@fx**LayoutGap+** | attribute directive  Flex layout fxLayoutGap with responsive variations
@fx**LayoutGap** | attribute directive  Flex layout fxLayoutGap
@fx**Show+** | attribute directive  Flex layout fxShow with responsive variations
@fx**Show** | attribute directive  Flex layout fxShow
@fx**Style** | attribute directive  Flex layout fxStyle


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
@td**DataTableCell** | attribute directive  Data table cell
@td**DataTableColumn!Sortable:\*\*** | attribute directive  Data table column !sortable + more variations
@td**DataTableColumnSortable:\*\*** | attribute directive  Data table column sortable + more variations
@td**DataTableRow** | attribute directive  Data table row
@td**DataTableTable** | attribute directive  Data table table
td-**data-table-sortable** | Data table sortable
td-**data-table-sortable:\*\*** | Data table sortable + more variations

#### Directive

Trigger | Description
--- | ---
@td**DirectiveAutotrim** | attribute directive  Directive autotrim
@td**DirectiveFaded** | attribute directive  Directive faded
@td**DirectiveMediaToggle** | attribute directive  Directive media toggle
@td**DirectiveMediaToggle:\*\*** | attribute directive  Directive media toggle + more variations
@td**DirectiveToggle** | attribute directive  Directive toggle

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
@td**FileUploadDrop** | attribute directive  File upload drop
@td**FileUploadSelect** | attribute directive  File upload select

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


### Material icon snippets

Trigger | Description
--- | ---
mi-**3d_rotation** | 3d_rotation
mi-**ac_unit** | ac_unit
mi-**access_alarm** | access_alarm
mi-**access_alarms** | access_alarms
mi-**access_time** | access_time
mi-**accessibility** | accessibility
mi-**accessible** | accessible
mi-**account_balance** | account_balance
mi-**account_balance_wallet** | account_balance_wallet
mi-**account_box** | account_box
mi-**account_circle** | account_circle
mi-**adb** | adb
mi-**add** | add
mi-**add_a_photo** | add_a_photo
mi-**add_alarm** | add_alarm
mi-**add_alert** | add_alert
mi-**add_box** | add_box
mi-**add_circle** | add_circle
mi-**add_circle_outline** | add_circle_outline
mi-**add_location** | add_location
mi-**add_shopping_cart** | add_shopping_cart
mi-**add_to_photos** | add_to_photos
mi-**add_to_queue** | add_to_queue
mi-**adjust** | adjust
mi-**airline_seat_flat** | airline_seat_flat
mi-**airline_seat_flat_angled** | airline_seat_flat_angled
mi-**airline_seat_individual_suite** | airline_seat_individual_suite
mi-**airline_seat_legroom_extra** | airline_seat_legroom_extra
mi-**airline_seat_legroom_normal** | airline_seat_legroom_normal
mi-**airline_seat_legroom_reduced** | airline_seat_legroom_reduced
mi-**airline_seat_recline_extra** | airline_seat_recline_extra
mi-**airline_seat_recline_normal** | airline_seat_recline_normal
mi-**airplanemode_active** | airplanemode_active
mi-**airplanemode_inactive** | airplanemode_inactive
mi-**airplay** | airplay
mi-**airport_shuttle** | airport_shuttle
mi-**alarm** | alarm
mi-**alarm_add** | alarm_add
mi-**alarm_off** | alarm_off
mi-**alarm_on** | alarm_on
mi-**album** | album
mi-**all_inclusive** | all_inclusive
mi-**all_out** | all_out
mi-**android** | android
mi-**announcement** | announcement
mi-**apps** | apps
mi-**archive** | archive
mi-**arrow_back** | arrow_back
mi-**arrow_downward** | arrow_downward
mi-**arrow_drop_down** | arrow_drop_down
mi-**arrow_drop_down_circle** | arrow_drop_down_circle
mi-**arrow_drop_up** | arrow_drop_up
mi-**arrow_forward** | arrow_forward
mi-**arrow_upward** | arrow_upward
mi-**art_track** | art_track
mi-**aspect_ratio** | aspect_ratio
mi-**assessment** | assessment
mi-**assignment** | assignment
mi-**assignment_ind** | assignment_ind
mi-**assignment_late** | assignment_late
mi-**assignment_return** | assignment_return
mi-**assignment_returned** | assignment_returned
mi-**assignment_turned_in** | assignment_turned_in
mi-**assistant** | assistant
mi-**assistant_photo** | assistant_photo
mi-**attach_file** | attach_file
mi-**attach_money** | attach_money
mi-**attachment** | attachment
mi-**audiotrack** | audiotrack
mi-**autorenew** | autorenew
mi-**av_timer** | av_timer
mi-**backspace** | backspace
mi-**backup** | backup
mi-**battery_alert** | battery_alert
mi-**battery_charging_full** | battery_charging_full
mi-**battery_full** | battery_full
mi-**battery_std** | battery_std
mi-**battery_unknown** | battery_unknown
mi-**beach_access** | beach_access
mi-**beenhere** | beenhere
mi-**block** | block
mi-**bluetooth** | bluetooth
mi-**bluetooth_audio** | bluetooth_audio
mi-**bluetooth_connected** | bluetooth_connected
mi-**bluetooth_disabled** | bluetooth_disabled
mi-**bluetooth_searching** | bluetooth_searching
mi-**blur_circular** | blur_circular
mi-**blur_linear** | blur_linear
mi-**blur_off** | blur_off
mi-**blur_on** | blur_on
mi-**book** | book
mi-**bookmark** | bookmark
mi-**bookmark_border** | bookmark_border
mi-**border_all** | border_all
mi-**border_bottom** | border_bottom
mi-**border_clear** | border_clear
mi-**border_color** | border_color
mi-**border_horizontal** | border_horizontal
mi-**border_inner** | border_inner
mi-**border_left** | border_left
mi-**border_outer** | border_outer
mi-**border_right** | border_right
mi-**border_style** | border_style
mi-**border_top** | border_top
mi-**border_vertical** | border_vertical
mi-**branding_watermark** | branding_watermark
mi-**brightness_1** | brightness_1
mi-**brightness_2** | brightness_2
mi-**brightness_3** | brightness_3
mi-**brightness_4** | brightness_4
mi-**brightness_5** | brightness_5
mi-**brightness_6** | brightness_6
mi-**brightness_7** | brightness_7
mi-**brightness_auto** | brightness_auto
mi-**brightness_high** | brightness_high
mi-**brightness_low** | brightness_low
mi-**brightness_medium** | brightness_medium
mi-**broken_image** | broken_image
mi-**brush** | brush
mi-**bubble_chart** | bubble_chart
mi-**bug_report** | bug_report
mi-**build** | build
mi-**burst_mode** | burst_mode
mi-**business** | business
mi-**business_center** | business_center
mi-**cached** | cached
mi-**cake** | cake
mi-**call** | call
mi-**call_end** | call_end
mi-**call_made** | call_made
mi-**call_merge** | call_merge
mi-**call_missed** | call_missed
mi-**call_missed_outgoing** | call_missed_outgoing
mi-**call_received** | call_received
mi-**call_split** | call_split
mi-**call_to_action** | call_to_action
mi-**camera** | camera
mi-**camera_alt** | camera_alt
mi-**camera_enhance** | camera_enhance
mi-**camera_front** | camera_front
mi-**camera_rear** | camera_rear
mi-**camera_roll** | camera_roll
mi-**cancel** | cancel
mi-**card_giftcard** | card_giftcard
mi-**card_membership** | card_membership
mi-**card_travel** | card_travel
mi-**casino** | casino
mi-**cast** | cast
mi-**cast_connected** | cast_connected
mi-**center_focus_strong** | center_focus_strong
mi-**center_focus_weak** | center_focus_weak
mi-**change_history** | change_history
mi-**chat** | chat
mi-**chat_bubble** | chat_bubble
mi-**chat_bubble_outline** | chat_bubble_outline
mi-**check** | check
mi-**check_box** | check_box
mi-**check_box_outline_blank** | check_box_outline_blank
mi-**check_circle** | check_circle
mi-**chevron_left** | chevron_left
mi-**chevron_right** | chevron_right
mi-**child_care** | child_care
mi-**child_friendly** | child_friendly
mi-**chrome_reader_mode** | chrome_reader_mode
mi-**class** | class
mi-**clear** | clear
mi-**clear_all** | clear_all
mi-**close** | close
mi-**closed_caption** | closed_caption
mi-**cloud** | cloud
mi-**cloud_circle** | cloud_circle
mi-**cloud_done** | cloud_done
mi-**cloud_download** | cloud_download
mi-**cloud_off** | cloud_off
mi-**cloud_queue** | cloud_queue
mi-**cloud_upload** | cloud_upload
mi-**code** | code
mi-**collections** | collections
mi-**collections_bookmark** | collections_bookmark
mi-**color_lens** | color_lens
mi-**colorize** | colorize
mi-**comment** | comment
mi-**compare** | compare
mi-**compare_arrows** | compare_arrows
mi-**computer** | computer
mi-**confirmation_number** | confirmation_number
mi-**contact_mail** | contact_mail
mi-**contact_phone** | contact_phone
mi-**contacts** | contacts
mi-**content_copy** | content_copy
mi-**content_cut** | content_cut
mi-**content_paste** | content_paste
mi-**control_point** | control_point
mi-**control_point_duplicate** | control_point_duplicate
mi-**copyright** | copyright
mi-**create** | create
mi-**create_new_folder** | create_new_folder
mi-**credit_card** | credit_card
mi-**crop** | crop
mi-**crop_16_9** | crop_16_9
mi-**crop_3_2** | crop_3_2
mi-**crop_5_4** | crop_5_4
mi-**crop_7_5** | crop_7_5
mi-**crop_din** | crop_din
mi-**crop_free** | crop_free
mi-**crop_landscape** | crop_landscape
mi-**crop_original** | crop_original
mi-**crop_portrait** | crop_portrait
mi-**crop_rotate** | crop_rotate
mi-**crop_square** | crop_square
mi-**dashboard** | dashboard
mi-**data_usage** | data_usage
mi-**date_range** | date_range
mi-**dehaze** | dehaze
mi-**delete** | delete
mi-**delete_forever** | delete_forever
mi-**delete_sweep** | delete_sweep
mi-**description** | description
mi-**desktop_mac** | desktop_mac
mi-**desktop_windows** | desktop_windows
mi-**details** | details
mi-**developer_board** | developer_board
mi-**developer_mode** | developer_mode
mi-**device_hub** | device_hub
mi-**devices** | devices
mi-**devices_other** | devices_other
mi-**dialer_sip** | dialer_sip
mi-**dialpad** | dialpad
mi-**directions** | directions
mi-**directions_bike** | directions_bike
mi-**directions_boat** | directions_boat
mi-**directions_bus** | directions_bus
mi-**directions_car** | directions_car
mi-**directions_railway** | directions_railway
mi-**directions_run** | directions_run
mi-**directions_subway** | directions_subway
mi-**directions_transit** | directions_transit
mi-**directions_walk** | directions_walk
mi-**disc_full** | disc_full
mi-**dns** | dns
mi-**do_not_disturb** | do_not_disturb
mi-**do_not_disturb_alt** | do_not_disturb_alt
mi-**do_not_disturb_off** | do_not_disturb_off
mi-**do_not_disturb_on** | do_not_disturb_on
mi-**dock** | dock
mi-**domain** | domain
mi-**done** | done
mi-**done_all** | done_all
mi-**donut_large** | donut_large
mi-**donut_small** | donut_small
mi-**drafts** | drafts
mi-**drag_handle** | drag_handle
mi-**drive_eta** | drive_eta
mi-**dvr** | dvr
mi-**edit** | edit
mi-**edit_location** | edit_location
mi-**eject** | eject
mi-**email** | email
mi-**enhanced_encryption** | enhanced_encryption
mi-**equalizer** | equalizer
mi-**error** | error
mi-**error_outline** | error_outline
mi-**euro_symbol** | euro_symbol
mi-**ev_station** | ev_station
mi-**event** | event
mi-**event_available** | event_available
mi-**event_busy** | event_busy
mi-**event_note** | event_note
mi-**event_seat** | event_seat
mi-**exit_to_app** | exit_to_app
mi-**expand_less** | expand_less
mi-**expand_more** | expand_more
mi-**explicit** | explicit
mi-**explore** | explore
mi-**exposure** | exposure
mi-**exposure_neg_1** | exposure_neg_1
mi-**exposure_neg_2** | exposure_neg_2
mi-**exposure_plus_1** | exposure_plus_1
mi-**exposure_plus_2** | exposure_plus_2
mi-**exposure_zero** | exposure_zero
mi-**extension** | extension
mi-**face** | face
mi-**fast_forward** | fast_forward
mi-**fast_rewind** | fast_rewind
mi-**favorite** | favorite
mi-**favorite_border** | favorite_border
mi-**featured_play_list** | featured_play_list
mi-**featured_video** | featured_video
mi-**feedback** | feedback
mi-**fiber_dvr** | fiber_dvr
mi-**fiber_manual_record** | fiber_manual_record
mi-**fiber_new** | fiber_new
mi-**fiber_pin** | fiber_pin
mi-**fiber_smart_record** | fiber_smart_record
mi-**file_download** | file_download
mi-**file_upload** | file_upload
mi-**filter** | filter
mi-**filter_1** | filter_1
mi-**filter_2** | filter_2
mi-**filter_3** | filter_3
mi-**filter_4** | filter_4
mi-**filter_5** | filter_5
mi-**filter_6** | filter_6
mi-**filter_7** | filter_7
mi-**filter_8** | filter_8
mi-**filter_9** | filter_9
mi-**filter_9_plus** | filter_9_plus
mi-**filter_b_and_w** | filter_b_and_w
mi-**filter_center_focus** | filter_center_focus
mi-**filter_drama** | filter_drama
mi-**filter_frames** | filter_frames
mi-**filter_hdr** | filter_hdr
mi-**filter_list** | filter_list
mi-**filter_none** | filter_none
mi-**filter_tilt_shift** | filter_tilt_shift
mi-**filter_vintage** | filter_vintage
mi-**find_in_page** | find_in_page
mi-**find_replace** | find_replace
mi-**fingerprint** | fingerprint
mi-**first_page** | first_page
mi-**fitness_center** | fitness_center
mi-**flag** | flag
mi-**flare** | flare
mi-**flash_auto** | flash_auto
mi-**flash_off** | flash_off
mi-**flash_on** | flash_on
mi-**flight** | flight
mi-**flight_land** | flight_land
mi-**flight_takeoff** | flight_takeoff
mi-**flip** | flip
mi-**flip_to_back** | flip_to_back
mi-**flip_to_front** | flip_to_front
mi-**folder** | folder
mi-**folder_open** | folder_open
mi-**folder_shared** | folder_shared
mi-**folder_special** | folder_special
mi-**font_download** | font_download
mi-**format_align_center** | format_align_center
mi-**format_align_justify** | format_align_justify
mi-**format_align_left** | format_align_left
mi-**format_align_right** | format_align_right
mi-**format_bold** | format_bold
mi-**format_clear** | format_clear
mi-**format_color_fill** | format_color_fill
mi-**format_color_reset** | format_color_reset
mi-**format_color_text** | format_color_text
mi-**format_indent_decrease** | format_indent_decrease
mi-**format_indent_increase** | format_indent_increase
mi-**format_italic** | format_italic
mi-**format_line_spacing** | format_line_spacing
mi-**format_list_bulleted** | format_list_bulleted
mi-**format_list_numbered** | format_list_numbered
mi-**format_paint** | format_paint
mi-**format_quote** | format_quote
mi-**format_shapes** | format_shapes
mi-**format_size** | format_size
mi-**format_strikethrough** | format_strikethrough
mi-**format_textdirection_l_to_r** | format_textdirection_l_to_r
mi-**format_textdirection_r_to_l** | format_textdirection_r_to_l
mi-**format_underlined** | format_underlined
mi-**forum** | forum
mi-**forward** | forward
mi-**forward_10** | forward_10
mi-**forward_30** | forward_30
mi-**forward_5** | forward_5
mi-**free_breakfast** | free_breakfast
mi-**fullscreen** | fullscreen
mi-**fullscreen_exit** | fullscreen_exit
mi-**functions** | functions
mi-**g_translate** | g_translate
mi-**gamepad** | gamepad
mi-**games** | games
mi-**gavel** | gavel
mi-**gesture** | gesture
mi-**get_app** | get_app
mi-**gif** | gif
mi-**golf_course** | golf_course
mi-**gps_fixed** | gps_fixed
mi-**gps_not_fixed** | gps_not_fixed
mi-**gps_off** | gps_off
mi-**grade** | grade
mi-**gradient** | gradient
mi-**grain** | grain
mi-**graphic_eq** | graphic_eq
mi-**grid_off** | grid_off
mi-**grid_on** | grid_on
mi-**group** | group
mi-**group_add** | group_add
mi-**group_work** | group_work
mi-**hd** | hd
mi-**hdr_off** | hdr_off
mi-**hdr_on** | hdr_on
mi-**hdr_strong** | hdr_strong
mi-**hdr_weak** | hdr_weak
mi-**headset** | headset
mi-**headset_mic** | headset_mic
mi-**healing** | healing
mi-**hearing** | hearing
mi-**help** | help
mi-**help_outline** | help_outline
mi-**high_quality** | high_quality
mi-**highlight** | highlight
mi-**highlight_off** | highlight_off
mi-**history** | history
mi-**home** | home
mi-**hot_tub** | hot_tub
mi-**hotel** | hotel
mi-**hourglass_empty** | hourglass_empty
mi-**hourglass_full** | hourglass_full
mi-**http** | http
mi-**https** | https
mi-**image** | image
mi-**image_aspect_ratio** | image_aspect_ratio
mi-**import_contacts** | import_contacts
mi-**import_export** | import_export
mi-**important_devices** | important_devices
mi-**inbox** | inbox
mi-**indeterminate_check_box** | indeterminate_check_box
mi-**info** | info
mi-**info_outline** | info_outline
mi-**input** | input
mi-**insert_chart** | insert_chart
mi-**insert_comment** | insert_comment
mi-**insert_drive_file** | insert_drive_file
mi-**insert_emoticon** | insert_emoticon
mi-**insert_invitation** | insert_invitation
mi-**insert_link** | insert_link
mi-**insert_photo** | insert_photo
mi-**invert_colors** | invert_colors
mi-**invert_colors_off** | invert_colors_off
mi-**iso** | iso
mi-**keyboard** | keyboard
mi-**keyboard_arrow_down** | keyboard_arrow_down
mi-**keyboard_arrow_left** | keyboard_arrow_left
mi-**keyboard_arrow_right** | keyboard_arrow_right
mi-**keyboard_arrow_up** | keyboard_arrow_up
mi-**keyboard_backspace** | keyboard_backspace
mi-**keyboard_capslock** | keyboard_capslock
mi-**keyboard_hide** | keyboard_hide
mi-**keyboard_return** | keyboard_return
mi-**keyboard_tab** | keyboard_tab
mi-**keyboard_voice** | keyboard_voice
mi-**kitchen** | kitchen
mi-**label** | label
mi-**label_outline** | label_outline
mi-**landscape** | landscape
mi-**language** | language
mi-**laptop** | laptop
mi-**laptop_chromebook** | laptop_chromebook
mi-**laptop_mac** | laptop_mac
mi-**laptop_windows** | laptop_windows
mi-**last_page** | last_page
mi-**launch** | launch
mi-**layers** | layers
mi-**layers_clear** | layers_clear
mi-**leak_add** | leak_add
mi-**leak_remove** | leak_remove
mi-**lens** | lens
mi-**library_add** | library_add
mi-**library_books** | library_books
mi-**library_music** | library_music
mi-**lightbulb_outline** | lightbulb_outline
mi-**line_style** | line_style
mi-**line_weight** | line_weight
mi-**linear_scale** | linear_scale
mi-**link** | link
mi-**linked_camera** | linked_camera
mi-**list** | list
mi-**live_help** | live_help
mi-**live_tv** | live_tv
mi-**local_activity** | local_activity
mi-**local_airport** | local_airport
mi-**local_atm** | local_atm
mi-**local_bar** | local_bar
mi-**local_cafe** | local_cafe
mi-**local_car_wash** | local_car_wash
mi-**local_convenience_store** | local_convenience_store
mi-**local_dining** | local_dining
mi-**local_drink** | local_drink
mi-**local_florist** | local_florist
mi-**local_gas_station** | local_gas_station
mi-**local_grocery_store** | local_grocery_store
mi-**local_hospital** | local_hospital
mi-**local_hotel** | local_hotel
mi-**local_laundry_service** | local_laundry_service
mi-**local_library** | local_library
mi-**local_mall** | local_mall
mi-**local_movies** | local_movies
mi-**local_offer** | local_offer
mi-**local_parking** | local_parking
mi-**local_pharmacy** | local_pharmacy
mi-**local_phone** | local_phone
mi-**local_pizza** | local_pizza
mi-**local_play** | local_play
mi-**local_post_office** | local_post_office
mi-**local_printshop** | local_printshop
mi-**local_see** | local_see
mi-**local_shipping** | local_shipping
mi-**local_taxi** | local_taxi
mi-**location_city** | location_city
mi-**location_disabled** | location_disabled
mi-**location_off** | location_off
mi-**location_on** | location_on
mi-**location_searching** | location_searching
mi-**lock** | lock
mi-**lock_open** | lock_open
mi-**lock_outline** | lock_outline
mi-**looks** | looks
mi-**looks_3** | looks_3
mi-**looks_4** | looks_4
mi-**looks_5** | looks_5
mi-**looks_6** | looks_6
mi-**looks_one** | looks_one
mi-**looks_two** | looks_two
mi-**loop** | loop
mi-**loupe** | loupe
mi-**low_priority** | low_priority
mi-**loyalty** | loyalty
mi-**mail** | mail
mi-**mail_outline** | mail_outline
mi-**map** | map
mi-**markunread** | markunread
mi-**markunread_mailbox** | markunread_mailbox
mi-**memory** | memory
mi-**menu** | menu
mi-**merge_type** | merge_type
mi-**message** | message
mi-**mic** | mic
mi-**mic_none** | mic_none
mi-**mic_off** | mic_off
mi-**mms** | mms
mi-**mode_comment** | mode_comment
mi-**mode_edit** | mode_edit
mi-**monetization_on** | monetization_on
mi-**money_off** | money_off
mi-**monochrome_photos** | monochrome_photos
mi-**mood** | mood
mi-**mood_bad** | mood_bad
mi-**more** | more
mi-**more_horiz** | more_horiz
mi-**more_vert** | more_vert
mi-**motorcycle** | motorcycle
mi-**mouse** | mouse
mi-**move_to_inbox** | move_to_inbox
mi-**movie** | movie
mi-**movie_creation** | movie_creation
mi-**movie_filter** | movie_filter
mi-**multiline_chart** | multiline_chart
mi-**music_note** | music_note
mi-**music_video** | music_video
mi-**my_location** | my_location
mi-**nature** | nature
mi-**nature_people** | nature_people
mi-**navigate_before** | navigate_before
mi-**navigate_next** | navigate_next
mi-**navigation** | navigation
mi-**near_me** | near_me
mi-**network_cell** | network_cell
mi-**network_check** | network_check
mi-**network_locked** | network_locked
mi-**network_wifi** | network_wifi
mi-**new_releases** | new_releases
mi-**next_week** | next_week
mi-**nfc** | nfc
mi-**no_encryption** | no_encryption
mi-**no_sim** | no_sim
mi-**not_interested** | not_interested
mi-**note** | note
mi-**note_add** | note_add
mi-**notifications** | notifications
mi-**notifications_active** | notifications_active
mi-**notifications_none** | notifications_none
mi-**notifications_off** | notifications_off
mi-**notifications_paused** | notifications_paused
mi-**offline_pin** | offline_pin
mi-**ondemand_video** | ondemand_video
mi-**opacity** | opacity
mi-**open_in_browser** | open_in_browser
mi-**open_in_new** | open_in_new
mi-**open_with** | open_with
mi-**pages** | pages
mi-**pageview** | pageview
mi-**palette** | palette
mi-**pan_tool** | pan_tool
mi-**panorama** | panorama
mi-**panorama_fish_eye** | panorama_fish_eye
mi-**panorama_horizontal** | panorama_horizontal
mi-**panorama_vertical** | panorama_vertical
mi-**panorama_wide_angle** | panorama_wide_angle
mi-**party_mode** | party_mode
mi-**pause** | pause
mi-**pause_circle_filled** | pause_circle_filled
mi-**pause_circle_outline** | pause_circle_outline
mi-**payment** | payment
mi-**people** | people
mi-**people_outline** | people_outline
mi-**perm_camera_mic** | perm_camera_mic
mi-**perm_contact_calendar** | perm_contact_calendar
mi-**perm_data_setting** | perm_data_setting
mi-**perm_device_information** | perm_device_information
mi-**perm_identity** | perm_identity
mi-**perm_media** | perm_media
mi-**perm_phone_msg** | perm_phone_msg
mi-**perm_scan_wifi** | perm_scan_wifi
mi-**person** | person
mi-**person_add** | person_add
mi-**person_outline** | person_outline
mi-**person_pin** | person_pin
mi-**person_pin_circle** | person_pin_circle
mi-**personal_video** | personal_video
mi-**pets** | pets
mi-**phone** | phone
mi-**phone_android** | phone_android
mi-**phone_bluetooth_speaker** | phone_bluetooth_speaker
mi-**phone_forwarded** | phone_forwarded
mi-**phone_in_talk** | phone_in_talk
mi-**phone_iphone** | phone_iphone
mi-**phone_locked** | phone_locked
mi-**phone_missed** | phone_missed
mi-**phone_paused** | phone_paused
mi-**phonelink** | phonelink
mi-**phonelink_erase** | phonelink_erase
mi-**phonelink_lock** | phonelink_lock
mi-**phonelink_off** | phonelink_off
mi-**phonelink_ring** | phonelink_ring
mi-**phonelink_setup** | phonelink_setup
mi-**photo** | photo
mi-**photo_album** | photo_album
mi-**photo_camera** | photo_camera
mi-**photo_filter** | photo_filter
mi-**photo_library** | photo_library
mi-**photo_size_select_actual** | photo_size_select_actual
mi-**photo_size_select_large** | photo_size_select_large
mi-**photo_size_select_small** | photo_size_select_small
mi-**picture_as_pdf** | picture_as_pdf
mi-**picture_in_picture** | picture_in_picture
mi-**picture_in_picture_alt** | picture_in_picture_alt
mi-**pie_chart** | pie_chart
mi-**pie_chart_outlined** | pie_chart_outlined
mi-**pin_drop** | pin_drop
mi-**place** | place
mi-**play_arrow** | play_arrow
mi-**play_circle_filled** | play_circle_filled
mi-**play_circle_outline** | play_circle_outline
mi-**play_for_work** | play_for_work
mi-**playlist_add** | playlist_add
mi-**playlist_add_check** | playlist_add_check
mi-**playlist_play** | playlist_play
mi-**plus_one** | plus_one
mi-**poll** | poll
mi-**polymer** | polymer
mi-**pool** | pool
mi-**portable_wifi_off** | portable_wifi_off
mi-**portrait** | portrait
mi-**power** | power
mi-**power_input** | power_input
mi-**power_settings_new** | power_settings_new
mi-**pregnant_woman** | pregnant_woman
mi-**present_to_all** | present_to_all
mi-**print** | print
mi-**priority_high** | priority_high
mi-**public** | public
mi-**publish** | publish
mi-**query_builder** | query_builder
mi-**question_answer** | question_answer
mi-**queue** | queue
mi-**queue_music** | queue_music
mi-**queue_play_next** | queue_play_next
mi-**radio** | radio
mi-**radio_button_checked** | radio_button_checked
mi-**radio_button_unchecked** | radio_button_unchecked
mi-**rate_review** | rate_review
mi-**receipt** | receipt
mi-**recent_actors** | recent_actors
mi-**record_voice_over** | record_voice_over
mi-**redeem** | redeem
mi-**redo** | redo
mi-**refresh** | refresh
mi-**remove** | remove
mi-**remove_circle** | remove_circle
mi-**remove_circle_outline** | remove_circle_outline
mi-**remove_from_queue** | remove_from_queue
mi-**remove_red_eye** | remove_red_eye
mi-**remove_shopping_cart** | remove_shopping_cart
mi-**reorder** | reorder
mi-**repeat** | repeat
mi-**repeat_one** | repeat_one
mi-**replay** | replay
mi-**replay_10** | replay_10
mi-**replay_30** | replay_30
mi-**replay_5** | replay_5
mi-**reply** | reply
mi-**reply_all** | reply_all
mi-**report** | report
mi-**report_problem** | report_problem
mi-**restaurant** | restaurant
mi-**restaurant_menu** | restaurant_menu
mi-**restore** | restore
mi-**restore_page** | restore_page
mi-**ring_volume** | ring_volume
mi-**room** | room
mi-**room_service** | room_service
mi-**rotate_90_degrees_ccw** | rotate_90_degrees_ccw
mi-**rotate_left** | rotate_left
mi-**rotate_right** | rotate_right
mi-**rounded_corner** | rounded_corner
mi-**router** | router
mi-**rowing** | rowing
mi-**rss_feed** | rss_feed
mi-**rv_hookup** | rv_hookup
mi-**satellite** | satellite
mi-**save** | save
mi-**scanner** | scanner
mi-**schedule** | schedule
mi-**school** | school
mi-**screen_lock_landscape** | screen_lock_landscape
mi-**screen_lock_portrait** | screen_lock_portrait
mi-**screen_lock_rotation** | screen_lock_rotation
mi-**screen_rotation** | screen_rotation
mi-**screen_share** | screen_share
mi-**sd_card** | sd_card
mi-**sd_storage** | sd_storage
mi-**search** | search
mi-**security** | security
mi-**select_all** | select_all
mi-**send** | send
mi-**sentiment_dissatisfied** | sentiment_dissatisfied
mi-**sentiment_neutral** | sentiment_neutral
mi-**sentiment_satisfied** | sentiment_satisfied
mi-**sentiment_very_dissatisfied** | sentiment_very_dissatisfied
mi-**sentiment_very_satisfied** | sentiment_very_satisfied
mi-**settings** | settings
mi-**settings_applications** | settings_applications
mi-**settings_backup_restore** | settings_backup_restore
mi-**settings_bluetooth** | settings_bluetooth
mi-**settings_brightness** | settings_brightness
mi-**settings_cell** | settings_cell
mi-**settings_ethernet** | settings_ethernet
mi-**settings_input_antenna** | settings_input_antenna
mi-**settings_input_component** | settings_input_component
mi-**settings_input_composite** | settings_input_composite
mi-**settings_input_hdmi** | settings_input_hdmi
mi-**settings_input_svideo** | settings_input_svideo
mi-**settings_overscan** | settings_overscan
mi-**settings_phone** | settings_phone
mi-**settings_power** | settings_power
mi-**settings_remote** | settings_remote
mi-**settings_system_daydream** | settings_system_daydream
mi-**settings_voice** | settings_voice
mi-**share** | share
mi-**shop** | shop
mi-**shop_two** | shop_two
mi-**shopping_basket** | shopping_basket
mi-**shopping_cart** | shopping_cart
mi-**short_text** | short_text
mi-**show_chart** | show_chart
mi-**shuffle** | shuffle
mi-**signal_cellular_4_bar** | signal_cellular_4_bar
mi-**signal_cellular_connected_no_internet_4_bar** | signal_cellular_connected_no_internet_4_bar
mi-**signal_cellular_no_sim** | signal_cellular_no_sim
mi-**signal_cellular_null** | signal_cellular_null
mi-**signal_cellular_off** | signal_cellular_off
mi-**signal_wifi_4_bar** | signal_wifi_4_bar
mi-**signal_wifi_4_bar_lock** | signal_wifi_4_bar_lock
mi-**signal_wifi_off** | signal_wifi_off
mi-**sim_card** | sim_card
mi-**sim_card_alert** | sim_card_alert
mi-**skip_next** | skip_next
mi-**skip_previous** | skip_previous
mi-**slideshow** | slideshow
mi-**slow_motion_video** | slow_motion_video
mi-**smartphone** | smartphone
mi-**smoke_free** | smoke_free
mi-**smoking_rooms** | smoking_rooms
mi-**sms** | sms
mi-**sms_failed** | sms_failed
mi-**snooze** | snooze
mi-**sort** | sort
mi-**sort_by_alpha** | sort_by_alpha
mi-**spa** | spa
mi-**space_bar** | space_bar
mi-**speaker** | speaker
mi-**speaker_group** | speaker_group
mi-**speaker_notes** | speaker_notes
mi-**speaker_notes_off** | speaker_notes_off
mi-**speaker_phone** | speaker_phone
mi-**spellcheck** | spellcheck
mi-**star** | star
mi-**star_border** | star_border
mi-**star_half** | star_half
mi-**stars** | stars
mi-**stay_current_landscape** | stay_current_landscape
mi-**stay_current_portrait** | stay_current_portrait
mi-**stay_primary_landscape** | stay_primary_landscape
mi-**stay_primary_portrait** | stay_primary_portrait
mi-**stop** | stop
mi-**stop_screen_share** | stop_screen_share
mi-**storage** | storage
mi-**store** | store
mi-**store_mall_directory** | store_mall_directory
mi-**straighten** | straighten
mi-**streetview** | streetview
mi-**strikethrough_s** | strikethrough_s
mi-**style** | style
mi-**subdirectory_arrow_left** | subdirectory_arrow_left
mi-**subdirectory_arrow_right** | subdirectory_arrow_right
mi-**subject** | subject
mi-**subscriptions** | subscriptions
mi-**subtitles** | subtitles
mi-**subway** | subway
mi-**supervisor_account** | supervisor_account
mi-**surround_sound** | surround_sound
mi-**swap_calls** | swap_calls
mi-**swap_horiz** | swap_horiz
mi-**swap_vert** | swap_vert
mi-**swap_vertical_circle** | swap_vertical_circle
mi-**switch_camera** | switch_camera
mi-**switch_video** | switch_video
mi-**sync** | sync
mi-**sync_disabled** | sync_disabled
mi-**sync_problem** | sync_problem
mi-**system_update** | system_update
mi-**system_update_alt** | system_update_alt
mi-**tab** | tab
mi-**tab_unselected** | tab_unselected
mi-**tablet** | tablet
mi-**tablet_android** | tablet_android
mi-**tablet_mac** | tablet_mac
mi-**tag_faces** | tag_faces
mi-**tap_and_play** | tap_and_play
mi-**terrain** | terrain
mi-**text_fields** | text_fields
mi-**text_format** | text_format
mi-**textsms** | textsms
mi-**texture** | texture
mi-**theaters** | theaters
mi-**thumb_down** | thumb_down
mi-**thumb_up** | thumb_up
mi-**thumbs_up_down** | thumbs_up_down
mi-**time_to_leave** | time_to_leave
mi-**timelapse** | timelapse
mi-**timeline** | timeline
mi-**timer** | timer
mi-**timer_10** | timer_10
mi-**timer_3** | timer_3
mi-**timer_off** | timer_off
mi-**title** | title
mi-**toc** | toc
mi-**today** | today
mi-**toll** | toll
mi-**tonality** | tonality
mi-**touch_app** | touch_app
mi-**toys** | toys
mi-**track_changes** | track_changes
mi-**traffic** | traffic
mi-**train** | train
mi-**tram** | tram
mi-**transfer_within_a_station** | transfer_within_a_station
mi-**transform** | transform
mi-**translate** | translate
mi-**trending_down** | trending_down
mi-**trending_flat** | trending_flat
mi-**trending_up** | trending_up
mi-**tune** | tune
mi-**turned_in** | turned_in
mi-**turned_in_not** | turned_in_not
mi-**tv** | tv
mi-**unarchive** | unarchive
mi-**undo** | undo
mi-**unfold_less** | unfold_less
mi-**unfold_more** | unfold_more
mi-**update** | update
mi-**usb** | usb
mi-**verified_user** | verified_user
mi-**vertical_align_bottom** | vertical_align_bottom
mi-**vertical_align_center** | vertical_align_center
mi-**vertical_align_top** | vertical_align_top
mi-**vibration** | vibration
mi-**video_call** | video_call
mi-**video_label** | video_label
mi-**video_library** | video_library
mi-**videocam** | videocam
mi-**videocam_off** | videocam_off
mi-**videogame_asset** | videogame_asset
mi-**view_agenda** | view_agenda
mi-**view_array** | view_array
mi-**view_carousel** | view_carousel
mi-**view_column** | view_column
mi-**view_comfy** | view_comfy
mi-**view_compact** | view_compact
mi-**view_day** | view_day
mi-**view_headline** | view_headline
mi-**view_list** | view_list
mi-**view_module** | view_module
mi-**view_quilt** | view_quilt
mi-**view_stream** | view_stream
mi-**view_week** | view_week
mi-**vignette** | vignette
mi-**visibility** | visibility
mi-**visibility_off** | visibility_off
mi-**voice_chat** | voice_chat
mi-**voicemail** | voicemail
mi-**volume_down** | volume_down
mi-**volume_mute** | volume_mute
mi-**volume_off** | volume_off
mi-**volume_up** | volume_up
mi-**vpn_key** | vpn_key
mi-**vpn_lock** | vpn_lock
mi-**wallpaper** | wallpaper
mi-**warning** | warning
mi-**watch** | watch
mi-**watch_later** | watch_later
mi-**wb_auto** | wb_auto
mi-**wb_cloudy** | wb_cloudy
mi-**wb_incandescent** | wb_incandescent
mi-**wb_iridescent** | wb_iridescent
mi-**wb_sunny** | wb_sunny
mi-**wc** | wc
mi-**web** | web
mi-**web_asset** | web_asset
mi-**weekend** | weekend
mi-**whatshot** | whatshot
mi-**widgets** | widgets
mi-**wifi** | wifi
mi-**wifi_lock** | wifi_lock
mi-**wifi_tethering** | wifi_tethering
mi-**work** | work
mi-**wrap_text** | wrap_text
mi-**youtube_searched_for** | youtube_searched_for
mi-**zoom_in** | zoom_in
mi-**zoom_out** | zoom_out
mi-**zoom_out_map** | zoom_out_map


## License

Angular material v2, Teradata covalent v1 & Angular flex layout v1 - IntelliJ Plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
