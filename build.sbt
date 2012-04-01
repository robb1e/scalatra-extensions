import com.typesafe.sbtscalariform._

organization := "org.scalatra"

name := "extensions"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.3",
  "org.scalatra" %% "scalatra-scalate" % "2.0.3",
  "org.fusesource.scalate" % "scalate-core" % "1.5.3",
  "net.liftweb" %% "lift-json" % "2.4-M4",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "compile"
)

seq(ScalariformPlugin.settings: _*)

publishTo <<= (version) { version: String =>
    val publishType = if (version.endsWith("SNAPSHOT")) "snapshots" else "releases"
    Some(
        Resolver.file(
            "guardian github " + publishType,
            file(System.getProperty("user.home") + "/robb1e.github.com/maven/repo-" + publishType)
        )
    )
}
