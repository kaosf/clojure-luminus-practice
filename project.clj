(defproject luminus-practice "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [lib-noir "0.8.0"]
                 [compojure "1.1.6"]
                 [ring-server "0.3.1"]
                 [selmer "0.5.9"]
                 [com.taoensso/timbre "3.0.0"]
                 [com.taoensso/tower "2.0.1"]
                 [markdown-clj "0.9.41"]
                 [environ "0.4.0"]
                 [korma "0.3.0-RC6"]
                 [postgresql/postgresql "9.1-901.jdbc4"]
                 [ragtime/ragtime.sql.files "0.3.4"]
                 [lobos "1.0.0-beta1"]]

  :repl-options {:init-ns luminus-practice.repl}
  :plugins [[lein-ring "0.8.10"]
            [lein-environ "0.4.0"]
            [ragtime/ragtime.lein "0.3.4"]]
  :ring {:handler luminus-practice.handler/app
         :init    luminus-practice.handler/init
         :destroy luminus-practice.handler/destroy}
  :ragtime {:migrations ragtime.sql.files/migrations
            :database "jdbc:postgresql://localhost:5432/my_website?user=luminus_practice"}
  :profiles
  {:uberjar {:aot :all}
   :production {:ring {:open-browser? false
                       :stacktraces?  false
                       :auto-reload?  false}}
   :dev {:dependencies [[ring-mock "0.1.5"]
                        [ring/ring-devel "1.2.1"]]
         :env {:dev true}}}
  :min-lein-version "2.0.0")
