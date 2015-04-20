(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  ":(")

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (and (>= age 13)
       (<= age 19)
       ))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
