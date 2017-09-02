(ns my-project.core
  (:require [my-project.util :as util]))

(defn -main []
  (println (util/red "Hello,") (util/blue "World") (util/green "!")))
