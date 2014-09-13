(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest a-test
  (testing "Trivial test for Project Euler Problem 1"
    (is (= multiplesOfThreeAndFive 233168))))
