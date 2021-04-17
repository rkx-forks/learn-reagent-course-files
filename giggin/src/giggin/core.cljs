(ns giggin.core
  (:require [reagent.core :as r]
            [giggin.components.header :refer [header]] ;; refer to functions defined in namespace
            [giggin.components.gigs :refer [gigs]]
            [giggin.components.orders :refer [orders]]
            [giggin.components.footer :refer [footer]]))

(defn app []
  [:div.container
   [header]
   [gigs]
   [orders]
   [footer]])

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))
