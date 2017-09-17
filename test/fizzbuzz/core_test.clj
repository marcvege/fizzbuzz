(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "fizzbuzz 15"
    (is (= (fizzbuzz 15)
           '("1" "2" "fizz" "4" "buzz" "fizz" "7" "8" "fizz" "buzz" "11" "fizz" "13" "14" "fizzbuzz")))))
