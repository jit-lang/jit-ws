(defproject clojure02 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :java-source-paths ["src"]
  :aot :all
  :main "Caller"
  :prep-tasks [["compile" "Foo"] "javac"]
  )
