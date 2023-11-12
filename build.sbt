
name := "KamonSBTProject"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "2.6.3",
  "io.kamon" %% "kamon-datadog" % "2.6.3"
)

enablePlugins(JavaAppPackaging)
