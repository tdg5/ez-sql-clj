(ns ez-sql.logger-test
  (:require [clojure.test :refer :all]
            [ez-sql.logger :as subject]
            [clojure.tools.logging :as clog]
            [clojure.tools.logging.test :as log-test]))

(deftest trace
  (testing "returns nil"
    (is (= nil (subject/trace :trace-returns-nil "trace-nil-msg"))))

  (testing "logs with ez-sql namespace"
    (log-test/with-log
      (let [msg-id :trace-has-ez-sql-namespace
            msg "trace-ns-msg"]
        (subject/trace msg-id msg)
        (is (log-test/logged? "ez-sql" :trace nil (str msg-id " " msg))))))

  (testing "logs with :trace level"
    (log-test/with-log
      (let [msg-id :trace-has-trace-level
            msg "trace-level-msg"]
        (subject/trace msg-id msg)
        (is (log-test/logged? "ez-sql" :trace nil (str msg-id " " msg))))))

  (testing "logs expected message"
    (log-test/with-log
      (let [msg-id :trace-logs-message
            msg "trace-msg-msg"]
        (subject/trace msg-id msg)
        (is (log-test/logged? "ez-sql" :trace nil (str msg-id " " msg))))))

  (testing "logs expected identifier with message"
    (log-test/with-log
      (let [msg-id :trace-logs-id-with-message
            msg "trace-msg-id-msg"]
        (subject/trace msg-id msg)
        (is (log-test/logged? "ez-sql" :trace nil (str msg-id " " msg))))))

  (testing "logs expected exception"
    (log-test/with-log
      (let [msg-id :trace-logs-exception
            msg "trace-exeception-msg"
            ex (Exception. "boom")]
        (subject/trace msg-id msg ex)
        (is (log-test/logged? "ez-sql" :trace ex (str msg-id " " msg ": " ex))))))

  (testing "logs expected identifier with exception"
    (log-test/with-log
      (let [msg-id :trace-logs-id-with-exception
            msg "trace-exeception-id-msg"
            ex (Exception. "boom")]
        (subject/trace msg-id msg ex)
        (is (log-test/logged? "ez-sql" :trace ex (str msg-id " " msg ": " ex)))))))

(deftest debug
  (testing "returns nil"
    (is (= nil (subject/debug :debug-returns-nil "debug-nil-msg"))))

  (testing "logs with ez-sql namespace"
    (log-test/with-log
      (let [msg-id :debug-has-ez-sql-namespace
            msg "debug-ns-msg"]
        (subject/debug msg-id msg)
        (is (log-test/logged? "ez-sql" :debug nil (str msg-id " " msg))))))

  (testing "logs with :debug level"
    (log-test/with-log
      (let [msg-id :debug-has-debug-level
            msg "debug-level-msg"]
        (subject/debug msg-id msg)
        (is (log-test/logged? "ez-sql" :debug nil (str msg-id " " msg))))))

  (testing "logs expected message"
    (log-test/with-log
      (let [msg-id :debug-logs-message
            msg "debug-msg-msg"]
        (subject/debug msg-id msg)
        (is (log-test/logged? "ez-sql" :debug nil (str msg-id " " msg))))))

  (testing "logs expected identifier with message"
    (log-test/with-log
      (let [msg-id :debug-logs-id-with-message
            msg "debug-msg-id-msg"]
        (subject/debug msg-id msg)
        (is (log-test/logged? "ez-sql" :debug nil (str msg-id " " msg))))))

  (testing "logs expected exception"
    (log-test/with-log
      (let [msg-id :debug-logs-exception
            msg "debug-exeception-msg"
            ex (Exception. "boom")]
        (subject/debug msg-id msg ex)
        (is (log-test/logged? "ez-sql" :debug ex (str msg-id " " msg ": " ex))))))

  (testing "logs expected identifier with exception"
    (log-test/with-log
      (let [msg-id :debug-logs-id-with-exception
            msg "debug-exeception-id-msg"
            ex (Exception. "boom")]
        (subject/debug msg-id msg ex)
        (is (log-test/logged? "ez-sql" :debug ex (str msg-id " " msg ": " ex)))))))

(deftest info
  (testing "returns nil"
    (is (= nil (subject/info :info-returns-nil "info-nil-msg"))))

  (testing "logs with ez-sql namespace"
    (log-test/with-log
      (let [msg-id :info-has-ez-sql-namespace
            msg "info-ns-msg"]
        (subject/info msg-id msg)
        (is (log-test/logged? "ez-sql" :info nil (str msg-id " " msg))))))

  (testing "logs with :info level"
    (log-test/with-log
      (let [msg-id :info-has-info-level
            msg "info-level-msg"]
        (subject/info msg-id msg)
        (is (log-test/logged? "ez-sql" :info nil (str msg-id " " msg))))))

  (testing "logs expected message"
    (log-test/with-log
      (let [msg-id :info-logs-message
            msg "info-msg-msg"]
        (subject/info msg-id msg)
        (is (log-test/logged? "ez-sql" :info nil (str msg-id " " msg))))))

  (testing "logs expected identifier with message"
    (log-test/with-log
      (let [msg-id :info-logs-id-with-message
            msg "info-msg-id-msg"]
        (subject/info msg-id msg)
        (is (log-test/logged? "ez-sql" :info nil (str msg-id " " msg))))))

  (testing "logs expected exception"
    (log-test/with-log
      (let [msg-id :info-logs-exception
            msg "info-exeception-msg"
            ex (Exception. "boom")]
        (subject/info msg-id msg ex)
        (is (log-test/logged? "ez-sql" :info ex (str msg-id " " msg ": " ex))))))

  (testing "logs expected identifier with exception"
    (log-test/with-log
      (let [msg-id :info-logs-id-with-exception
            msg "info-exeception-id-msg"
            ex (Exception. "boom")]
        (subject/info msg-id msg ex)
        (is (log-test/logged? "ez-sql" :info ex (str msg-id " " msg ": " ex)))))))

(deftest warn
  (testing "returns nil"
    (is (= nil (subject/warn :warn-returns-nil "warn-nil-msg"))))

  (testing "logs with ez-sql namespace"
    (log-test/with-log
      (let [msg-id :warn-has-ez-sql-namespace
            msg "warn-ns-msg"]
        (subject/warn msg-id msg)
        (is (log-test/logged? "ez-sql" :warn nil (str msg-id " " msg))))))

  (testing "logs with :warn level"
    (log-test/with-log
      (let [msg-id :warn-has-warn-level
            msg "warn-level-msg"]
        (subject/warn msg-id msg)
        (is (log-test/logged? "ez-sql" :warn nil (str msg-id " " msg))))))

  (testing "logs expected message"
    (log-test/with-log
      (let [msg-id :warn-logs-message
            msg "warn-msg-msg"]
        (subject/warn msg-id msg)
        (is (log-test/logged? "ez-sql" :warn nil (str msg-id " " msg))))))

  (testing "logs expected identifier with message"
    (log-test/with-log
      (let [msg-id :warn-logs-id-with-message
            msg "warn-msg-id-msg"]
        (subject/warn msg-id msg)
        (is (log-test/logged? "ez-sql" :warn nil (str msg-id " " msg))))))

  (testing "logs expected exception"
    (log-test/with-log
      (let [msg-id :warn-logs-exception
            msg "warn-exeception-msg"
            ex (Exception. "boom")]
        (subject/warn msg-id msg ex)
        (is (log-test/logged? "ez-sql" :warn ex (str msg-id " " msg ": " ex))))))

  (testing "logs expected identifier with exception"
    (log-test/with-log
      (let [msg-id :warn-logs-id-with-exception
            msg "warn-exeception-id-msg"
            ex (Exception. "boom")]
        (subject/warn msg-id msg ex)
        (is (log-test/logged? "ez-sql" :warn ex (str msg-id " " msg ": " ex)))))))

(deftest error
  (testing "returns nil"
    (is (= nil (subject/error :error-returns-nil "error-nil-msg"))))

  (testing "logs with ez-sql namespace"
    (log-test/with-log
      (let [msg-id :error-has-ez-sql-namespace
            msg "error-ns-msg"]
        (subject/error msg-id msg)
        (is (log-test/logged? "ez-sql" :error nil (str msg-id " " msg))))))

  (testing "logs with :error level"
    (log-test/with-log
      (let [msg-id :error-has-error-level
            msg "error-level-msg"]
        (subject/error msg-id msg)
        (is (log-test/logged? "ez-sql" :error nil (str msg-id " " msg))))))

  (testing "logs expected message"
    (log-test/with-log
      (let [msg-id :error-logs-message
            msg "error-msg-msg"]
        (subject/error msg-id msg)
        (is (log-test/logged? "ez-sql" :error nil (str msg-id " " msg))))))

  (testing "logs expected identifier with message"
    (log-test/with-log
      (let [msg-id :error-logs-id-with-message
            msg "error-msg-id-msg"]
        (subject/error msg-id msg)
        (is (log-test/logged? "ez-sql" :error nil (str msg-id " " msg))))))

  (testing "logs expected exception"
    (log-test/with-log
      (let [msg-id :error-logs-exception
            msg "error-exeception-msg"
            ex (Exception. "boom")]
        (subject/error msg-id msg ex)
        (is (log-test/logged? "ez-sql" :error ex (str msg-id " " msg ": " ex))))))

  (testing "logs expected identifier with exception"
    (log-test/with-log
      (let [msg-id :error-logs-id-with-exception
            msg "error-exeception-id-msg"
            ex (Exception. "boom")]
        (subject/error msg-id msg ex)
        (is (log-test/logged? "ez-sql" :error ex (str msg-id " " msg ": " ex)))))))
