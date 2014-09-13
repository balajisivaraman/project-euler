(ns project-euler.core)

(def multiplesOfThreeAndFive
  (reduce + 0
          (filter (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0)))
                  (range 1 1000))))

(println multiplesOfThreeAndFive)
