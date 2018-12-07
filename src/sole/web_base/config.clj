(ns sole.web-base.config
  "Task pipeline configuration tasks."
  {:boot/export-tasks true}
  (:require [boot.core :as boot :refer [deftask task-options!]]
            [sole.core :as sole]))

(deftask production
  "Configure a task pipeline with production options"
  []
  ;; TODO: Generate sweet task options from environment data
  (sole/task-options-for 'sole.web-base.config/production)
  identity)

(deftask development
  "Configure a task pipeline with development options"
  []
  ;; TODO: Generate sweet task options from environment data
  (sole/task-options-for 'sole.web-base.config/development)
  identity)

(deftask testing
  "Configure a task pipeline with testing options"
  []
  ;; TODO: Generate sweet task options from environment data
  (sole/task-options-for 'sole.web-base.config/testing)
  identity)
