name := "shapes-oo-scala"

version := "0.4"

scalaVersion := "3.2.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-Ysafe-init", "-language:strictEquality")

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.2.14"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.17.0" % Test
)
