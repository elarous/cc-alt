(ns cc-cljs.events
  (:require [kee-frame.core :refer [reg-event-db]]
            [re-frame.core :as rf :refer [path]]
            [cc-cljs.db :refer [default-db]]))

(reg-event-db
 :reset
 (fn [_ _]
   default-db))

;; sign up form
(reg-event-db
 :register/set-email
 [(path :register :email)]
 (fn [_ [email]]
   email))

(reg-event-db
 :register/set-password
 [(path :register :password)]
 (fn [_ [password]]
   password))

(reg-event-db
 :register/set-re-password
 [(path :register :re-password)]
 (fn [_ [re-password]]
   re-password))

(reg-event-db
 :register/register
 (fn [db _]
   (js/console.log "Register user")
   db))
