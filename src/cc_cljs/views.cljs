(ns cc-cljs.views
  (:require [re-frame.core :refer [subscribe dispatch]]
            ["semantic-ui-react" :as ui]))

(defn register-form []
  [:div
   [:> ui/Grid {:text-align "center" :vertical-align "middle"}
    [:> ui/Grid.Column {:style {:max-width 450}}
     [:> ui/Header {:as "h2" :color "blue" :text-align "center"}
      " Register A New Account"]
     [:> ui/Form {:size "large"}
      [:> ui/Segment {:stacked true}
       [:> ui/Form.Input {:fluid true
                          :icon "user"
                          :icon-position "left"
                          :placeholder "Email address"
                          :on-change
                          #(dispatch [:register/set-email (-> % .-target .-value)])
                          :value @(subscribe [:register/email])}]
       [:> ui/Form.Input {:fluid true :icon "lock"
                          :icon-position "left"
                          :placeholder "Password"
                          :type "password"
                          :on-change #(dispatch [:register/set-password (-> % .-target .-value)])
                          :value @(subscribe [:register/password])}]
       [:> ui/Form.Input {:fluid true :icon "lock"
                          :icon-position "left"
                          :placeholder "Password Again"
                          :type "password"
                          :on-change
                          #(dispatch [:register/set-re-password (-> % .-target .-value)])
                          :value @(subscribe [:register/re-password])}]
       [:> ui/Button {:color "blue"
                      :fluid true
                      :size "large"
                      :on-click #(dispatch [:register/register])}
        "Login"]]]]]])
