(require '[cljs.build.api :as b])

(b/build "src"
         {:output-dir "out"
          :output-to "out/main.js"
          :optimizations :none
          :preloads '[process.env]
          :closure-warnings {:non-standard-jsdoc :off
                             :global-this :off}
          :language-in :es6
          :language-out :es5
          :main 'example.core
          :verbose true
          :npm-deps {:react "15.6.1"
                     :react-dom "15.6.1"
                     :styled-components "1.4.6"}})
