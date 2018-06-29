// Copyright 2018 Sourcerer Inc. All Rights Reserved.
// Author: Alexander Surkov (alex@sourcerer.io),

// Inspired by GitHub Liguist heuristics (https://github.com/github/linguist).

package app.hashers

/**
 * List of regexps that are matched against file pathname. Used to filter out
 * vendor specific files from the repo statistics.
 */
val VendorConventions = listOf(
	// Caches
	Regex("""(^|/)cache/"""),

	// Dependencies
  Regex("""^[Dd]ependencies/"""),

	// Distributions
  Regex("""(^|/)dist/"""),

	// C deps
  Regex("""^deps/"""),
  Regex("""(^|/)configure$"""),
  Regex("""(^|/)config.guess$"""),
  Regex("""(^|/)config.sub$"""),

	// stuff autogenerated by autoconf - still C deps
  Regex("""(^|/)aclocal.m4"""),
  Regex("""(^|/)libtool.m4"""),
  Regex("""(^|/)ltoptions.m4"""),
  Regex("""(^|/)ltsugar.m4"""),
  Regex("""(^|/)ltversion.m4"""),
  Regex("""(^|/)lt~obsolete.m4"""),

	// Linters
  Regex("""cpplint.py"""),

	// Node dependencies
  Regex("""node_modules/"""),

	// Bower Components
  Regex("""bower_components/"""),

	// Erlang bundles
  Regex("""^rebar$"""),
  Regex("""erlang.mk"""),

	// Go dependencies
  Regex("""Godeps/_workspace/"""),

	// GNU indent profiles
  Regex(""".indent.pro"""),

	// Minified JavaScript and CSS
  Regex("""(\.|-)min\.(js|css)$"""),

	// Stylesheets imported from packages
  Regex("""([^\s]*)import\.(css|less|scss|styl)$"""),

	// Bootstrap css and js
  Regex("""(^|/)bootstrap([^.]*)\.(js|css|less|scss|styl)$"""),
  Regex("""(^|/)custom\.bootstrap([^\s]*)(js|css|less|scss|styl)$"""),

	// Font Awesome
  Regex("""(^|/)font-awesome\.(css|less|scss|styl)$"""),
  Regex("""(^|/)font-awesome/.*\.(css|less|scss|styl)$"""),

	// Foundation css
  Regex("""(^|/)foundation\.(css|less|scss|styl)$"""),

	// Normalize.css
  Regex("""(^|/)normalize\.(css|less|scss|styl)$"""),

	// Skeleton.css
  Regex("""(^|/)skeleton\.(css|less|scss|styl)$"""),

	// Bourbon css
  Regex("""(^|/)[Bb]ourbon/.*\.(css|less|scss|styl)$"""),

	// Animate.css
  Regex("""(^|/)animate\.(css|less|scss|styl)$"""),

	// Materialize.css
  Regex("""(^|/)materialize\.(css|less|scss|styl|js)$"""),

	// Select2
  Regex("""(^|/)select2/.*\.(css|scss|js)$"""),

	// Vendored dependencies
  Regex("""third[-_]?party/"""),
  Regex("""3rd[-_]?party/"""),
  Regex("""vendors?/"""),
  Regex("""extern(al)?/"""),
  Regex("""(^|/)[Vv]+endor/"""),

	// Debian packaging
  Regex("""^debian/"""),

	// Haxelib projects often contain a neko bytecode file named run.n
  Regex("""run.n$"""),

	// Bootstrap Datepicker
  Regex("""bootstrap-datepicker/"""),

	// Commonly Bundled JavaScript frameworks

	// jQuery
  Regex("""(^|/)jquery([^.]*)\.js$"""),
  Regex("""(^|/)jquery\-\d\.\d+(\.\d+)?\.js$"""),

	// jQuery UI
  Regex("""(^|/)jquery\-ui(\-\d\.\d+(\.\d+)?)?(\.\w+)?\.(js|css)$"""),
  Regex("""(^|/)jquery\.(ui|effects)\.([^.]*)\.(js|css)$"""),

	// jQuery Gantt
  Regex("""jquery.fn.gantt.js"""),

	// jQuery fancyBox
  Regex("""jquery.fancybox.(js|css)"""),

	// Fuel UX
  Regex("""fuelux.js"""),

	// jQuery File Upload
  Regex("""(^|/)jquery\.fileupload(-\w+)?\.js$"""),

	// jQuery dataTables
  Regex("""jquery.dataTables.js"""),

	// bootboxjs
  Regex("""bootbox.js"""),

	// pdf-worker
  Regex("""pdf.worker.js"""),

	// Slick
  Regex("""(^|/)slick\.\w+.js$"""),

	// Leaflet plugins
  Regex("""(^|/)Leaflet\.Coordinates-\d+\.\d+\.\d+\.src\.js$"""),
  Regex("""leaflet.draw-src.js"""),
  Regex("""leaflet.draw.css"""),
  Regex("""Control.FullScreen.css"""),
  Regex("""Control.FullScreen.js"""),
  Regex("""leaflet.spin.js"""),
  Regex("""wicket-leaflet.js"""),

	// Sublime Text workspace files
  Regex(""".sublime-project"""),
  Regex(""".sublime-workspace"""),

	// VS Code workspace files
  Regex(""".vscode"""),

	// Prototype
  Regex("""(^|/)prototype(.*)\.js$"""),
  Regex("""(^|/)effects\.js$"""),
  Regex("""(^|/)controls\.js$"""),
  Regex("""(^|/)dragdrop\.js$"""),

	// Typescript definition files
  Regex("""(.*?)\.d\.ts$"""),

	// MooTools
  Regex("""(^|/)mootools([^.]*)\d+\.\d+.\d+([^.]*)\.js$"""),

	// Dojo
  Regex("""(^|/)dojo\.js$"""),

	// MochiKit
  Regex("""(^|/)MochiKit\.js$"""),

	// YUI
  Regex("""(^|/)yahoo-([^.]*)\.js$"""),
  Regex("""(^|/)yui([^.]*)\.js$"""),

	// WYS editors
  Regex("""(^|/)ckeditor\.js$"""),
  Regex("""(^|/)tiny_mce([^.]*)\.js$"""),
  Regex("""(^|/)tiny_mce/(langs|plugins|themes|utils)"""),

	// Ace Editor
  Regex("""(^|/)ace-builds/"""),

	// Fontello CSS files
  Regex("""(^|/)fontello(.*?)\.css$"""),

	// MathJax
  Regex("""(^|/)MathJax/"""),

	// Chart.js
  Regex("""(^|/)Chart\.js$"""),

	// CodeMirror
  Regex("""(^|/)[Cc]ode[Mm]irror/(\d+\.\d+/)?(lib|mode|theme|addon|keymap|demo)"""),

	// SyntaxHighlighter - http://alexgorbatchev.com/
  Regex("""(^|/)shBrush([^.]*)\.js$"""),
  Regex("""(^|/)shCore\.js$"""),
  Regex("""(^|/)shLegacy\.js$"""),

	// AngularJS
  Regex("""(^|/)angular([^.]*)\.js$"""),

	// D3.js
  Regex("""(^|\/)d3(\.v\d+)?([^.]*)\.js$"""),

	// React
  Regex("""(^|/)react(-[^.]*)?\.js$"""),

	// flow-typed
  Regex("""(^|/)flow-typed/.*\.js$"""),

	// Modernizr
  Regex("""(^|/)modernizr\-\d\.\d+(\.\d+)?\.js$"""),
  Regex("""(^|/)modernizr\.custom\.\d+\.js$"""),

	// Knockout
  Regex("""(^|/)knockout-(\d+\.){3}(debug\.)?js$"""),

	// Python

	// Sphinx
  Regex("""(^|/)docs?/_?(build|themes?|templates?|static)/"""),

	// django
  Regex("""(^|/)admin_media/"""),
  Regex("""(^|/)env/"""),

	// Fabric
  Regex("""^fabfile\.py$"""),

	// WAF
  Regex("""^waf$"""),

	// .osx
  Regex("""^.osx$"""),

	// Obj-C

	// Xcode
  Regex("""\.xctemplate/"""),
  Regex("""\.imageset/"""),

	// Carthage
  Regex("""(^|/)Carthage/"""),

	// Sparkle
  Regex("""(^|/)Sparkle/"""),

	// Crashlytics
  Regex("""Crashlytics.framework/"""),

	// Fabric
  Regex("""Fabric.framework/"""),

	// BuddyBuild
  Regex("""BuddyBuildSDK.framework/"""),

	// Realm
  Regex("""Realm.framework"""),

	// RealmSwift
  Regex("""RealmSwift.framework"""),

	// git config files
  Regex("""gitattributes$"""),
  Regex("""gitignore$"""),
  Regex("""gitmodules$"""),

	// Groovy

	// Gradle
  Regex("""(^|/)gradlew$"""),
  Regex("""(^|/)gradlew\.bat$"""),
  Regex("""(^|/)gradle/wrapper/"""),

	// Java

	// Maven
  Regex("""(^|/)mvnw$"""),
  Regex("""(^|/)mvnw\.cmd$"""),
  Regex("""(^|/)\.mvn/wrapper/"""),

	// .NET

	// Visual Studio IntelliSense
  Regex("""-vsdoc\.js$"""),
  Regex("""\.intellisense\.js$"""),

	// jQuery validation plugin (MS bundles this with asp.net mvc),
  Regex("""(^|/)jquery([^.]*)\.validate(\.unobtrusive)?\.js$"""),
  Regex("""(^|/)jquery([^.]*)\.unobtrusive\-ajax\.js$"""),

	// Microsoft Ajax
  Regex("""(^|/)[Mm]icrosoft([Mm]vc)?([Aa]jax|[Vv]alidation)(\.debug)?\.js$"""),

	// NuGet
  Regex("""^[Pp]ackages\/.+\.\d+\/"""),

	// ExtJS
  Regex("""(^|/)extjs/.*?\.js$"""),
  Regex("""(^|/)extjs/.*?\.xml$"""),
  Regex("""(^|/)extjs/.*?\.txt$"""),
  Regex("""(^|/)extjs/.*?\.html$"""),
  Regex("""(^|/)extjs/.*?\.properties$"""),
  Regex("""(^|/)extjs/.sencha/"""),
  Regex("""(^|/)extjs/docs/"""),
  Regex("""(^|/)extjs/builds/"""),
  Regex("""(^|/)extjs/cmd/"""),
  Regex("""(^|/)extjs/examples/"""),
  Regex("""(^|/)extjs/locale/"""),
  Regex("""(^|/)extjs/packages/"""),
  Regex("""(^|/)extjs/plugins/"""),
  Regex("""(^|/)extjs/resources/"""),
  Regex("""(^|/)extjs/src/"""),
  Regex("""(^|/)extjs/welcome/"""),

	// Html5shiv
  Regex("""(^|/)html5shiv\.js$"""),

	// Test fixtures
  Regex("""^[Tt]ests?/fixtures/"""),
  Regex("""^[Ss]pecs?/fixtures/"""),

	// PhoneGap/Cordova
  Regex("""(^|/)cordova([^.]*)\.js$"""),
  Regex("""(^|/)cordova\-\d\.\d(\.\d)?\.js$"""),

	// Foundation js
  Regex("""foundation(\..*)?\.js$"""),

	// Vagrant
  Regex("""^Vagrantfile$"""),

	// .DS_Stores
  Regex(""".[Dd][Ss]_[Ss]tore$"""),

	// R packages
  Regex("""^vignettes/"""),
  Regex("""^inst/extdata/"""),

	// Octicons
  Regex("""octicons.css"""),
  Regex("""sprockets-octicons.scss"""),

	// Typesafe Activator
  Regex("""(^|/)activator$"""),
  Regex("""(^|/)activator\.bat$"""),

	// ProGuard
  Regex("""proguard.pro"""),
  Regex("""proguard-rules.pro"""),

	// PuPHPet
  Regex("""^puphpet/"""),

	// Android Google APIs
  Regex("""(^|/)\.google_apis/"""),

	// Jenkins Pipeline
  Regex("""^Jenkinsfile$""")
)