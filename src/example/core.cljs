(ns example.core)

(def hello 42)

(defn what-kind? []
  "Cruel No More")

(js/console.log (what-kind?))

(enable-console-print!)

(println "I'm in the console too!")
