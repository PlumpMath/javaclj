(ns javaclj.core
  [:import javaclj.JavaClassTest])

(defn -main
  "the main function"
  []

  (let [myobject (new JavaClassTest)]
    (println "Hello, World!")
    (println (.testMethod myobject "foobar"))))
