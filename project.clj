(defproject zigi/test "1.0"
  :description "Contains the logic for the Virtual DB and the connectors"
  :plugins [[lein-sub "0.3.0"]
            [lein-shell "0.5.0"]
            [lein-unpack-resources "0.1.1"]
            [lein-resource "16.9.1"]
            [lein-zip "0.1.1"]
            [lein-cloverage "1.1.1"]
            [jonase/eastwood "0.3.10"]]

  :profiles {:prod {:aot :all
                    :omit-source true}}
  :sub [;; "non_nested"
        "nested"]
  

;;   :uberjar-exclusions [#"META-INF/*"]
  :aliases {})
