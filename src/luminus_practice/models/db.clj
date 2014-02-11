(ns luminus-practice.models.db
  (:use korma.core
        [korma.db :only (defdb)]))

(def db-spec {:subprotocol "postgresql"
              :subname "//localhost/my_website"
              :user "admin"
              :password "admin"})
