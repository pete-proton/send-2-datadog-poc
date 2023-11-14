
name := "KamonSBTProject"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "2.6.3",
  "io.kamon" %% "kamon-datadog" % "2.6.3",
  "ch.qos.logback" % "logback-classic" % "1.3.11" % "runtime",
  "org.logback-extensions" % "logback-ext-loggly" % "0.1.2",
  "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.2",
  "ch.qos.logback.contrib" % "logback-jackson" % "0.1.2",
  //"io.kamon" % "kanela-agent" % "1.0.18" % "runtime",
  "io.kamon" %% "kamon-bundle" % "2.5.9",
  "io.kamon" %% "kamon-apm-reporter" % "2.5.9"

)

enablePlugins(JavaAppPackaging)

//lazy val findKanelaAgent = taskKey[String]("Finds the Kanela agent jar path")
//
//findKanelaAgent := {
//  val cp = (dependencyClasspath in Runtime).value
//  val agentPath = cp.find(_.data.getName.startsWith("kanela-agent"))
//    .map(_.data.getAbsolutePath)
//    .getOrElse(throw new Exception("Kanela agent not found"))
//  println(s"Kanela Agent Path: $agentPath")
//  agentPath
//}
//javaOptions in run ++= Seq(
//  s"-javaagent:${findKanelaAgent.value}"
//)

fork in run := true

javaOptions in run ++= Seq(
  "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005"
)