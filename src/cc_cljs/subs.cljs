(ns cc-cljs.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
 :register/email
 (fn [db _]
   (get-in db [:register :email])))

(reg-sub
 :register/password
 (fn [db _]
   (get-in db [:register :password])))

(reg-sub
 :register/re-password
 (fn [db _]
   (get-in db [:register :re-password])))
