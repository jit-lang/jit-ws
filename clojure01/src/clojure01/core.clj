(ns clojure01.core (:gen-class))
(require ['clj-antlr.core :as 'antlr])
(use 'clojure.pprint)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
  (println (System/getProperty "user.dir"))
  (def text (JitIO/readHttpUtf8 "https://github.com/javacommons/TIL/raw/master/testdata/B.java"))
  (println text)
  ;(def json (antlr/parser "grammars/JSON.g4"))
  ;(pprint (json "[1,2,3]"))
  ;(def java9 (antlr/parser "grammars/Java9.g4"))
  ;(def java9 (antlr/parser "grammars/Java8.g4"))
  (def java9 (antlr/parser (JitIO/readResUtf8 "grammars/Java9.g4")))

  ;(pprint (java9 text))
  ;(pprint (antlr/parse java9 {:root "compilationUnit"} "import java.lang.String;"))
  (pprint (antlr/parse java9 {:root "compilationUnit"} text))
  (def output (with-out-str (pprint (antlr/parse java9 {:root "compilationUnit"} text))))
  (TwinText/open  text output)
  )

;;(json "[1,2,3]")