(defproject clomacs-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies  [[org.clojure/clojure "1.9.0"] ;; Use recent version of Clojure
                  [markdown-clj "0.9.28"]       ;; markdown-clj dependency
                  [clomacs "0.0.4-SNAPSHOT"]]
  :repl-options {:init-ns clomacs-demo.core})
