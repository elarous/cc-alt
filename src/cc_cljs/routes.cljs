(ns cc-cljs.routes
  (:require [bidi.bidi :as bidi]))

(def routes ["" {"/" :nearby
                 "/preferred" :preferred
                 "/login" :login
                 "/register" :register}])

