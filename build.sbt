name := "scala-practice"

version := "0.1"

scalaVersion := "2.12.4"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "http://oss.sonatype.org/content/repositories/releases",
  DefaultMavenRepository)

libraryDependencies += "org.specs2" % "specs2_2.10" % "3.3.1" % "test"