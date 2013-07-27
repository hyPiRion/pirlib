(ns leiningen.new.pirlib
  (:require [leiningen.new.templates :as t]
            [leiningen.core.main :as main]))

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
  (let [render (t/renderer "pirlib")
        {username ":username" :as opts} (parse-opts opt-list)
        main-ns (t/sanitize-ns name)
        data {:raw-name name
              :name (t/project-name name)
              :nested-dirs (t/name-to-path name)
              :namespace main-ns
              :username username
              :year (t/year)}
        render #(render % data)]
    (expect-keys opts ["username"])
    (main/info (str "Generating a pirlib named " name "..."))
    (t/->files data
               ["LICENSE" (render "LICENSE")]
               ["CONTRIBUTING.md" (render "CONTRIBUTING.md")]
               ["README.md" (render "README.md")]
               ["src/{{nested-dirs}}/main.clj" (render "main.clj")]
               ["test/{{nested-dirs}}/test/main.clj" (render "test.clj")]
               ["project.clj" (render "project.clj")]
               [".gitignore" (render "gitignore")])))
