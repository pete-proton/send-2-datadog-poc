
name := "KamonSBTProject"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "2.6.3",
  "io.kamon" %% "kamon-datadog" % "2.6.3",
  "ch.qos.logback" % "logback-classic" % "1.3.11" % "runtime",
  "org.logback-extensions" % "logback-ext-loggly" % "0.1.2",
  "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.2",
  "ch.qos.logback.contrib" % "logback-jackson" % "0.1.2"
)

enablePlugins(JavaAppPackaging)
