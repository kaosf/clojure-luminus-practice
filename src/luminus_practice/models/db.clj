(ns luminus-practice.models.db
  (:use korma.core
        [korma.db :only (defdb)]))

(def db-spec
  {:datasource
    (doto (new PGPoolingDataSource)
     (.setServerName   "localhost")
     (.setDatabaseName "my_website")
     (.setUser         "admin")
     (.setPassword     "admin")
     (.setMaxConnections 10))})
