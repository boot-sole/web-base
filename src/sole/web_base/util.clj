(ns sole.web-base.util
  "Utility level tasks meant to be highly orthogonal and composable."
  {:boot/export-tasks true}
  (:require [boot.core :as boot :refer [deftask task-options!]]
            [boot.task.built-in :as builtin]))

(deftask build
  "Compile code, produce assets, and generally make a complete fileset
  for running the code."
  []
  (or
   ;; TODO: Generate a sweet task from environment data
   identity))

(deftask run
  "Run the application"
  []
  (or
   ;; TODO: Generate a sweet task from environment data
   identity))

(deftask run-tests
  "Build and run all the tests."
  []
  (or
   ;; TODO: Generate a sweet task from environment data
   identity))

(deftask package
  "Package the fileset into whatever output format you want."
  []
  (or
   ;; TODO: Generate a sweet task from environment data
   identity))
