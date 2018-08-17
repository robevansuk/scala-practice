name := "scala-practice"

version := "0.1"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-unchecked",
  "-deprecation",
  "-feature",
  "-Xfatal-warnings",
  "-Xlint:_,-missing-interpolator",
  "-Ypartial-unification")

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "http://oss.sonatype.org/content/repositories/releases",
  "defaultMavenRepo" at "http://repo1.maven.org/maven2",
//  "MarkLogic Repository" at "http://developer.marklogic.com/maven2",
  "Readytalk Bintray" at "http://dl.bintray.com/readytalk/maven",
  "jitpack" at "https://jitpack.io"
)
resolvers ++= Seq("scalaz-bintray" at "https://dl.bintray.com/scalaz/releases")

lazy val Http4s = Seq(
  "org.http4s" %% "http4s-blaze-server",
  "org.http4s" %% "http4s-circe",
  "org.http4s" %% "http4s-dsl",
  "org.http4s" %% "http4s-blaze-client"
).map(_ % "0.18.15")

libraryDependencies += "org.specs2"     %% "specs2-core"     % "4.0.0" % "test"
libraryDependencies += "org.scalactic"  %% "scalactic"       % "3.0.4"
libraryDependencies += "org.scalatest"  %% "scalatest"       % "3.0.5"
libraryDependencies += "io.circe"       %% "circe-literal"   % "0.9.2"
libraryDependencies += "ch.qos.logback" %  "logback-classic" % "1.2.3"

libraryDependencies ++= Http4s



scalacOptions in Test ++= Seq("-Yrangepos")
