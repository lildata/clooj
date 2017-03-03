(defproject clooj "0.5.1"
  :description "clooj, a small IDE for clojure"
  :url "https://github.com/arthuredelstein/clooj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main clooj.core
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [clj-inspector "0.0.12"]
                 [slamhound "1.5.5"]
                 [com.cemerick/pomegranate "3.1"]
                 [com.fifesoft/rsyntaxtextarea "2.6.1"]
                 [org.clojure/tools.nrepl "0.2.12"]])
