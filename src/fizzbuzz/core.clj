(ns fizzbuzz.core)

(def fizzes
  (cycle ["" "" "fizz"]))

(def buzzes
  (cycle ["" "" "" "" "buzz"]))

(def words
  (replace {"" nil} (map str fizzes buzzes)))

(def numbers
  (map str (rest (range))))

(def zip
  (map #(or %1 %2) words numbers))

(def fizzbuzz
  (fn [number]
    (take number zip)))