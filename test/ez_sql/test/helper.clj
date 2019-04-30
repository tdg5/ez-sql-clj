(ns ez-sql.test.helper
  (:require [hotlog.core :as hotlog]))

(defonce initialized?
  (atom false))

(defn- configure-test-logger []
  (hotlog/build-logger {:appenders [{:path "test.log" :type :file}]
                        :level :trace
                        :name "ez-sql"}))

(defn- initialize! []
  (when-not @initialized?
    (configure-test-logger)
    (reset! initialized? true)))

(initialize!)
