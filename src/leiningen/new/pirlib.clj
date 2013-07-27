(ns leiningen.new.pirlib
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files year]]
            [leiningen.core.main :as main]))

(def render (renderer "pirlib"))

(defn parse-opts [opt-list]
  (when (odd? (count opt-list))
    (main/abort
     "Error: pirlib template expects :key value pairs after the library name."))
  (apply hash-map opt-list))

(defn expect-keys [opts expected-keys]
  (doseq [expected-key expected-keys]
    (when-not (contains? opts (str ":" expected-key))
      (main/abort (str "Error: No " expected-key " specified.")))))

(defn pirlib
  "FIXME: write documentation"
  [name & opt-list]
  (let [{username ":username" :as opts} (parse-opts opt-list)
        data {:name name
              :sanitized (name-to-path name)
              :username username
              :year (year)}
        render #(render % data)]
    (expect-keys opts ["username"])
    (main/info (str "Generating a pirlib named " name "..."))
    (->files data
             ["LICENSE" (render "LICENSE")]
             ["CONTRIBUTING.md" (render "CONTRIBUTING.md")]
             ["src/{{sanitized}}/foo.clj" (render "foo.clj")])))
