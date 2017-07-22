# cljs-atlaskit-node-modules
Trying to get atlaskit working with node-modules

Run:

```
lein trampoline run -m clojure.main build.clj
```

to compile the js and then run:

```
python -m http.server
```

to start the server on localhost:8000. And behold the unfortunate errors I get when requiring styled components

```

rule.js:4 Uncaught ReferenceError: module$home$mitchel$Development$cljs_atlaskit_node_modules$node_modules$styled_components$lib$vendor$postcss$container is not defined
    at rule.js:4
(anonymous) @ rule.js:4
comment.js:5 Uncaught ReferenceError: module$home$mitchel$Development$cljs_atlaskit_node_modules$node_modules$styled_components$lib$vendor$postcss$node is not defined
    at comment.js:5
(anonymous) @ comment.js:5
parser.js:5 Uncaught ReferenceError: module$home$mitchel$Development$cljs_atlaskit_node_modules$node_modules$styled_components$lib$vendor$postcss$declaration is not defined
    at parser.js:5
(anonymous) @ parser.js:5
parse.js:6 Uncaught ReferenceError: module$home$mitchel$Development$cljs_atlaskit_node_modules$node_modules$styled_components$lib$vendor$postcss$input is not defined
    at parse.js:6
(anonymous) @ parse.js:6
root.js:6 Uncaught ReferenceError: module$home$mitchel$Development$cljs_atlaskit_node_modules$node_modules$styled_components$lib$vendor$postcss$container is not defined
    at root.js:6
(anonymous) @ root.js:6
input.js:4 Uncaught ReferenceError: module$home$mitchel$Development$cljs_atlaskit_node_modules$node_modules$styled_components$lib$vendor$postcss$css_syntax_error is not defined
    at input.js:4
(anonymous) @ input.js:4
css-syntax-error.js:4 Uncaught ReferenceError: require is not defined
    at css-syntax-error.js:4
(anonymous) @ css-syntax-error.js:4
safe-parser.js:10 Uncaught TypeError: Super expression must either be null or a function, not undefined
    at _inherits$$module$home$mitchel$Development$cljs_atlaskit_node_modules$node_modules$styled_components$lib$vendor$postcss_safe_parser$safe_parser (safe-parser.js:10)
    at safe-parser.js:12
    at safe-parser.js:17
```
