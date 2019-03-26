(defproject clojure01 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.9.0"]
                 [clj-antlr "0.2.4"]
                 [commons-lang/commons-lang "2.6"]          ; // 2019/03/22
                 [commons-io/commons-io "2.6"]              ; // 2019/03/22
                 [org.antlr/antlr4 "4.7.2"]                 ; // 2019/03/14
                 [org.antlr/antlr4-runtime "4.7.2"]         ; // 2019/03/14
                 ]
  :aot :all
  :main clojure01.core
  :java-source-paths ["src"]
  )
