(ns luminus-practice.models.db
  (:use korma.core
        [korma.db :only (defdb)]))

(def db-spec {:name "jdbc/myDatasource"})
