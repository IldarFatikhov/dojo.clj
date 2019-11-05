(ns dojo.pg-test
  (:require [pg.core :as clj-pg]
            [clojure.test :refer :all])
  (:import (org.testcontainers.containers PostgreSQLContainer)))

(defn init []
  (let [postgres (PostgreSQLContainer. "postgres:9.6.2")]
    (.withUsername postgres "postgres")
    (.withPassword postgres "mysecretpassword")
    (.start postgres)
    postgres))

(deftest test-connect
  (let [database (init)]
        (println (.getJdbcUrl init))))