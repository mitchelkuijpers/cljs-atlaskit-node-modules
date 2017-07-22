(ns example.core
  (:require [react :refer [createElement]]
            ["react-dom/server" :as ReactDOMServer :refer [renderToString]]
            [styled-components :refer [styled]]))

(js/console.log (renderToString (createElement "div" nil "Hello World!")))
