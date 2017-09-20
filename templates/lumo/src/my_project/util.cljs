(ns my-project.util
  ;; FIXME: change my-project to your project's name
  (:require [clojure.string :as string]))

(defn colorize [text code] (str "\033[01;" code "m" text "\033[0m"))
(defn red [text] (colorize text 31))
(defn green [text] (colorize text 32))
(defn yellow [text] (colorize text 33))
(defn blue [text] (colorize text 34))
(defn purple [text] (colorize text 35))
(defn cyan [text] (colorize text 36))

(defn log-info [& items] (println (green (apply str "[INFO] " items))))
(defn log-success [& items] (println (green (apply str "[SUCCESS] " items))))
(defn log-debug [& items] (println (purple (apply str "[DEBUG] " items))))
(defn log-warning [& items] (println (yellow (apply str "[WARN] " items))))
(defn log-error [& items] (println (red (apply str "[ERROR] " items))))

(def fs (js/require "fs"))

(defn slurp [filename]
  (.toString (fs.readFileSync filename)))

(defn assign [target & sources]
  (apply js/Object.assign target (map clj->js sources)))

(defn ppipe
  "chains .then calls to apply functions to the passed promise"
  [p & fns] (reduce #(.then %1 %2) p fns))
; (ppipe (.resolve js/Promise 1)
;        (fn [n] (inc n))
;        (fn [n] (+ 3 n))
;        println) ; 5
; ## as opposed to ##
; (-> (.resolve js/Promise 1)
;     (.then (fn [n] (inc n)))
;     (.then (fn [n] (+ 3 n)))
;     (.then println))
