(defproject ez-sql "0.1.0-SNAPSHOT"
  :description "Some niceties wrapping JDBC"
  :url "https://github.com/tdg5/ez-sql-clj"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "0.4.490"]]
  :jvm-opts ["-Duser.timezone=UTC"]
  :profiles {:dev {:dependencies [[hotlog "0.1.2-SNAPSHOT" :exclusions [org.slf4j/slf4j-api]]
                                  [org.clojure/tools.logging "0.5.0-alpha.1"]]
                   :jvm-opts ["-Xverify:none"]
                   :plugins      [[lein-auto "0.1.3"]]
                   :source-paths ["src"]}}
  :repl-options {:init-ns ez-sql.core}
  :repositories [["releases" {:url "https://clojars.org"
                              :creds :gpg}]])
