(defproject shopify "0.3.0-SNAPSHOT"
  :description "A library for interacting with the Shopify platform.  Forked from https://github.com/jamesmacaulay/shopify-clj."
  :url "https://github.com/benzenwen/shopify-clj"
  :scm {:name "git"
        :url "https://github.com/benzenwen/shopify-clj"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.flatland/useful "0.11.5"]
                 [prismatic/plumbing "0.5.5"]
                 [digest "1.4.6"]
                 [clj-http "3.8.0"]
                 [com.cemerick/friend "0.2.3"]]
  :profiles {:dev {:dependencies [[ring-mock "0.3.2"]
                                  [org.clojure/clojure "1.6.0"]]}
             :test {:dependencies [[cheshire "5.8.0"]
                                   [org.clojure/clojure "1.6.0"]
                                   [ring-mock "0.1.3"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.5"]}
  :plugins [[lein-marginalia "0.9.1"]
            [codox "0.10.3"]]
  :codox {:output-dir "docs/codox"})
