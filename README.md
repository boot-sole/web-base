# The sole of a boot web application

This project is a set of orthogonal, composable, configurable [Boot]
tasks that together describe some common patterns for building web
applications with Boot.

[Boot]: https://boot-clj.com


## Structure

There are 11 tasks included in this library, however there are only
four that you will use regularly from the command line. Broadly, the
tasks can be broken down into three different categories:

- configuration
- utility
- user


### Configuration Tasks

There are three configuration tasks; one task for each configuration
type. They are named after the build type they are used with:
`development`, `testing` and `release`.

You won't typically call these tasks directly since all they do is
configure the boot task environment for the type of build you wish to
run. They do not actually run any build code.

In order for this to be useful, other tasks must also be specified...


### Utility Tasks

Those other tasks are typically going to be the four utility tasks
`build`, `package`, `run`, and `run-tests`. These tasks encode the
basic concepts of building and testing a web application.

First there's the `build` task which is responsible for creating a
task pipeline for building the application. This includes everything
like compiling code, producing assets and generally creating a
consistent fileset for running the web application.

Next there's the `package` task.  This task is responsible for
performing any packaging-specific source transformations, and creating
whatever code artifact you specify.

The `run` task is responsible for doing everything it takes to
properly spin up and properly tear-down your application. This often
includes starting a web-server, serving files from the fileset,
ensuring a database exists and has been fully migrated.

However, and this is __IMPORTANT__: the `run` task should not block.
That is if you were to run `boot build run`, it should set up and then
immediately tear down your application. To run it once manually you
would append the built-in `wait` task like so: `boot build run wait`

Finally, there is `run-tests` which does everything needed to run the
tests.


### User Tasks

Finally, there are four user level tasks: `dev`, `test`, `auto-test`,
and `release`. These are all convenient compositions of config and
built-in boot tasks.

The `dev` task uses the `development` configuration, and then sets up
a filesystem `watch` pipeline that runs `build` and then `run` every
time a file in the fileset is changed.

The `test` task uses the `testing` configuration and then runs the
tests once, `auto-test` is the same except that it runs the tests
continuously with `watch`.

Finally, the `release` task uses the `production` configuration and
runs the `build` task to create the fileset and then the `package`
task to bundle it into whatever format you've chosen for distribution.


## License

Copyright © 2018 Geoff Shannon

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
