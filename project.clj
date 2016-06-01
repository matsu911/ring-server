(defproject matsu911/ring-server "0.4.1"
  :description "Library for running Ring web servers"
  :url "https://github.com/weavejester/ring-server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ring "1.3.2"]
                 [ring-refresh "0.1.2"]]
  :plugins [[codox "0.8.10"]]
  :profiles {:dev {:dependencies [[clj-http "0.4.1"]]}})
