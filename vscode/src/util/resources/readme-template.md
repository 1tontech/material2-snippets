Angular material v2, Teradata covalent v1, Angular flex layout v1 & Material icon snippets for Visual studio code
=================================================================================================================

Visual studio code plugin containing Angular material v2, Teradata covalent v1 & Angular flex layout v1 snippets. This plugin works in both in the stable & the insiders build

![Plugin in action](help.gif)

The detailed list of supported template triggers are listed [below](#documentation)

Feel free to let me know what else you want added via the [issues](https://github.com/1tontech/material2-snippets/issues)

Suggestions, feedback and other comments welcome via [@1tontech](https://twitter.com/1tontech) on Twitter.

## Usage

Create a new HTML document and

1. Type `md-` followed by pressing `Ctrl+Space` to see all available angular material design snippets.
2. Type `td-` followed by pressing `Ctrl+Space` to see all available teradata covalent snippets.
3. Type `@fx` followed by pressing `Ctrl+Space` to see all available angular flex layout snippets.
4. Type `mi-` followed by pressing `Ctrl+Space` to see all available material icon snippets.

Here are the conventions that will make it easy to lookup templates

1. If a tag supports multiple children, the template trigger version with `*` implies the template uses dynamic number of children `*ngFor` variation. The `*` comes from `*ngFor`
2. If a template trigger has `:**` variation, this means this variation contains the maximum number of options for that component. `**` comes from [ant](https://ant.apache.org/manual/dirtasks.html) which matches all the files under folder & sub folders
3. If a template trigger has `:?` variation, the template contains additional help that helps you completely utilize the existing templates
4. If a template trigger has `_`(underscore) variation, this is a snippet(partial) that can be added to the component. This exists mainly to avoid creating variations of all permutations for the base component
5. If a template trigger has `@` variation, this snippet targets the attribute of an html element in your markup. Think of `@` as `html attribute`
6. If a template trigger has `+` variation, this snippet allows you to specify responsive variation
7. If a template trigger has `$` variation, this snippet contains the observable variation

## Mind map
1. `*` => `*ngFor` variation
2. `@` => Targets html attribute
3. `_` => Html snippet
4. `+` => Responsive variations
5. `$` => Observable variation
6. `:**` => maximum variations
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
