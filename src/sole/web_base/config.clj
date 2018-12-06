(ns sole.web-base.config
  "Task pipeline configuration tasks."
  {:boot/export-tasks true}
  (:require [boot.core :as boot :refer [deftask task-options!]]))

(deftask production
  "Configure a task pipeline with production options"
  []
  (task-options!
   ;; TODO: Generate sweet task options from environment data
   )
  identity)

(deftask development
  "Configure a task pipeline with development options"
  []
  (task-options!
   ;; TODO: Generate sweet task options from environment data
   )
  identity)

(deftask testing
  "Configure a task pipeline with testing options"
  []
  (task-options!
   ;; TODO: Generate sweet task options from environment data
   )
  identity)
