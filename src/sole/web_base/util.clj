(ns sole.web-base.util
  "Utility level tasks meant to be highly orthogonal and composable."
  {:boot/export-tasks true}
  (:require [boot.core :as boot :refer [deftask task-options!]]
            [boot.task.built-in :as builtin]
            [sole.core :as sole]))

(deftask build
  "Compile code, produce assets, and generally make a complete fileset
  for running the code."
  []
  ;; TODO: Generate a sweet task from environment data
  (sole/task-pipeline-for 'sole.web-base.util/build))

(deftask run
  "Run the application"
  []
  ;; TODO: Generate a sweet task from environment data
  (sole/task-pipeline-for 'sole.web-base.util/run))

(deftask run-tests
  "Build and run all the tests."
  []
  ;; TODO: Generate a sweet task from environment data
  (sole/task-pipeline-for 'sole.web-base.util/run-tests))

(deftask package
  "Package the fileset into whatever output format you want."
  []
  ;; TODO: Generate a sweet task from environment data
  (sole/task-pipeline-for 'sole.web-base.util/package))
