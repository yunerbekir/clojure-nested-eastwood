(defproject test/non_nested "3.0"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/data.json "0.2.6"]]
  :plugins [[lein-cloverage "1.1.2"]
            [lein-parent "0.3.8"] [jonase/eastwood "0.3.10"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.trace "0.7.9"]]}
             :prod {:aot :all
                    :omit-source true}})
