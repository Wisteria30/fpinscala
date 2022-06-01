ThisBuild / scalaVersion := "2.13.6"

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.7"

lazy val root = (project in file("."))
  .aggregate(exercises, answers)
  .settings(
    name := "fpinscala",
    libraryDependencies += scalaTest % Test,
  )

lazy val exercises = (project in file("exercises"))
  .settings(
    name := "exercises",
    libraryDependencies += scalaTest % Test,
  )

lazy val answers = (project in file("answers"))
  .settings(
    name := "answers",
    libraryDependencies += scalaTest % Test,
  )
