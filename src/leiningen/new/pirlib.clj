(ns leiningen.new.pirlib
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files year]]
            [leiningen.core.main :as main]))

(def render (renderer "pirlib"))

(defn pirlib
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :year (year)}
        render #(render % data)]
    (main/info (str "Generating a pirlib named " name "..."))
    (->files data
             ["LICENSE" (render "LICENSE")]
             ["CONTRIBUTING.md" (render "CONTRIBUTING.md")]
             ["src/{{sanitized}}/foo.clj" (render "foo.clj")])))
