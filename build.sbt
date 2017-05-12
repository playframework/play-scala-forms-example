name := """play-scala-forms-example"""

version := "2.5.x"

scalaVersion := "2.11.11"

libraryDependencies += filters

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % "test"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

