name := """play-scala-forms-example"""

version := "2.5.x"

scalaVersion := "2.11.11"

libraryDependencies += filters

lazy val root = (project in file(".")).enablePlugins(PlayScala)

