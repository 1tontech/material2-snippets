Visual studio code (vscode) plugin/extension containing snippets for Angular Material 2, Angular Flex layout 1, Teradata Covalent 1 & Material icons
====================================================================================================================================================

This plugin works in both in the stable & the insiders build

![Plugin in action](help.gif)

The detailed list of supported template triggers are listed [below](#documentation)

Feel free to let me know what else you want added via the [issues](https://github.com/1tontech/material2-snippets/issues)

Suggestions, feedback and other comments welcome via [@1tontech](https://twitter.com/1tontech) on Twitter.

## Usage


Create a new HTML document and

1. Type `md-` for all material components. Use `@md` for all material attribute directives. `md` comes from `material design`
2. Type `@fx` for all flex layout attribute directives. `fx` comes from `flex layout`
3. Type `td-` for all teradata covalent components. Use `@td` for all teradata covalent attribute directives. `td` comes from `tera data` which is the company responsible for covalent development. `td` is quite similar to `md`

`Ctrl+Space` will trigger autocomplete dialog for snippet selection

> 1. For autocompletion of components, use hyphen `-` format. i.e for material button, type `md-button`
> 2. For autocompletion of attribute directives, use `@` format. i.e for flex layout, use `@fxLayout` (or) use `@mdTooltip` for material tooltip

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
@@@GENERATED_MATERIAL_SNIPPETS@@@

### Angular flex layout snippets
@@@GENERATED_FLEX_SNIPPETS@@@

### Teradata covalent snippets
@@@GENERATED_COVALENT_SNIPPETS@@@

### Material icon snippets
@@@GENERATED_MATERIAL_ICON_SNIPPETS@@@

## License

Angular material v2, Teradata covalent v1 & Angular flex layout v1 - IntelliJ Plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
