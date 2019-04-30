(ns ez-sql.logger
  (:require [hotlog.macro :as hotlog-macro]))

;; define log! fn
(hotlog-macro/defn-log! {:logger-ns 'ez-sql})

;; hide log! fn
(def ^:private log! log!)

(defn trace
  ([id msg]
   (log! :trace (str id " " msg)))
  ([id msg ex]
   (log! :trace ex (str id " " msg ": " ex))))

(defn debug
  ([id msg]
   (log! :debug (str id " " msg)))
  ([id msg ex]
   (log! :debug ex (str id " " msg ": " ex))))

(defn info
  ([id msg]
   (log! :info (str id " " msg)))
  ([id msg ex]
   (log! :info ex (str id " " msg ": " ex))))

(defn warn
  ([id msg]
   (log! :warn (str id " " msg)))
  ([id msg ex]
   (log! :warn ex (str id " " msg ": " ex))))

(defn error
  ([id msg]
   (log! :error (str id " " msg)))
  ([id msg ex]
   (log! :error ex (str id " " msg ": " ex))))
