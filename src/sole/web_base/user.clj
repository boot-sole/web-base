(ns sole.web-base.user
  "High-level everyday usage tasks."
  {:boot/export-tasks true}
  (:require [boot.core :as boot :refer [deftask]]
            [boot.task.built-in :as builtin]
            [sole.web-base.config :as config]
            [sole.web-base.util :as util]))

(deftask dev
  "Run local development"
  []
  (comp (config/development)
        (builtin/watch)
        (util/build)
        (util/run)))

(deftask test
  "Run the tests once"
  []
  (comp (config/testing)
        (util/run-tests)))

(deftask auto-test
  "Run an automatic test runner"
  []
  (comp (config/testing)
        (builtin/watch)
        (util/run-tests)))

(deftask release
  "Create a release build"
  []
  (comp (config/production)
        (util/build)
        (util/package)
        (builtin/target :dir #{"target"})))
