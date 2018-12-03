(ns cc-cljs.core
  (:require [reagent.core :as  r]
            [re-frame.core :as rf]
            [kee-frame.core :as k]
            ["semantic-ui-react" :as ui]))



(defn start! []
  (println "Starting ...")
  (rf/clear-subscription-cache!)
  #_(k/start! {:initial-db {:name "oussamas"} #_default-db
             #_:routes #_routes
             :root-component [content]
             :debug? true}))

(defn stop! []
  (println "Stopping ..."))
