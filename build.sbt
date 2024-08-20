name := "shapes-oo-scala"

version := "0.4"

scalaVersion := "3.3.3"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies ++= Seq(
  "org.creativescala" %% "doodle"     % "0.23.0",
  "org.scalatest"     %% "scalatest"  % "3.2.19"  % Test,
  "org.scalacheck"    %% "scalacheck" % "1.18.0"  % Test
)
