(defproject {{raw-name}} "0.1.0-SNAPSHOT"
  :description "TODO: Add in description."
  :url "https://github.com/{{username}}/{{name}}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:plugins [[codox "0.6.4"]]
                   :codox {:output-dir "codox"}}}
  :deploy-branches ["stable"])
