(ns my-project.core
  ;; FIXME: change my-project to your project's name
  (:require [my-project.util :as util]))

(defn -main []
  (println (util/red "Hello,") (util/blue "World") (util/green "!")))
