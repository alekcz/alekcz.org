(ns index
  (:require [pcp :as pcp]
            [garden.core :refer [css]]))

(defn resp []
  (pcp/html
    [:html {:style "font-family: 'Source Sans Pro', Arial, Helvetica, sans-serif;text-align: center;"
            :lang "en"}
      [:head 
        [:title "I'm Alex and I write code."]
        [:link {:rel "shortcut icon" :type "image/png" :href "/favi.png"}]
        [:meta {:charset "utf-8"}]
        [:meta {:name "viewport" :content "width=device-width,initial-scale=1"}]
        [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
        [:meta {:name "description" :content "I'm Alex and I write code."}]
        [:meta {:name "keywords" :content "clojure, pcp, vue, design, web development, lisp"}]
        [:meta {:name "author" :content "alekcz"}]
        [:meta {:name "twitter:site" :content "https://alekcz.org"}]
        [:meta {:name "twitter:card" :content "summary"}]
        [:meta {:name "twitter:title" :content "I'm Alex and I write code."}]
        [:meta {:name "twitter:description" :content "I'm Alex and I write code."}]
        [:meta {:name "twitter:creator" :content "@alekcz"}]
        [:meta {:name "twitter:image" :content "https://alekcz.org/alexander-round.png"}]
        [:meta {:property "og:title" :content "I'm Alex and I write code."}]
        [:meta {:property "og:type" :content "website"}]
        [:meta {:property "og:url" :content "https://alekcz.org"}]
        [:meta {:property "og:image" :content "https://alekcz.org/alexander-round.png"}]
        [:meta {:property "og:site_name" :content "I'm Alex and I write code."}]
        [:style 
          (css [:p.info { :background-color "#EEE" 
                          :font-size "13px"
                          :margin-top "40px"
                          :padding "10px" 
                          :text-align "left" 
                          :width "300px"}])
          (css [:strong { :font-size "13px"}])
          (css [:a { :color "#D21323"}])
          (css [:code   { :font-size "12px" 
                          :font-weight "normal"}])]]
      [:body 
        [:div 
              {:style "display: flex; flex-direction: column; justify-content: center; align-items: center; min-height: 90vh;"
              }
              [:img {:src "/alexander-round.png" :width "200px" :height "200px"}]
              [:h1 "I write code."]
              [:p "Catch me on: " [:br] [:a {:href "https://github.com/alekcz"} "github/alekcz"] " or " [:a {:href "https://twitter.com/alekcz"} "twitter/alekcz"]]]]]))

(pcp/response 200 (resp) "text/html")            
