(ns cc-cljs.controllers
  (:require [kee-frame.core :refer [reg-controller]]))

(reg-controller :nearby
                {:params (fn [{handler :handler}]
                           (when (= handler :nearby) true))
                 :start [:nearby/load]})

(reg-controller :preferred
                {:params (fn [{handler :handler}]
                           (when (= handler :preferred) true))
                 :start [:preferred/load]})

(reg-controller :login
                {:params (fn [{handler :handler}]
                           (when (= handler :login) true))})

(reg-controller :register
                {:params (fn [{handler :handler}]
                           (when (= handler :register) true))})
