name := "shapes-oo-scala"

version := "0.4"

scalaVersion := "3.7.2"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies ++= Seq(
  "org.creativescala" %% "doodle"     % "0.30.0",
  "org.scalatest"     %% "scalatest"  % "3.2.19"  % Test,
  "org.scalacheck"    %% "scalacheck" % "1.18.1"  % Test
)
