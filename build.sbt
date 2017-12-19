name := "scala-practice"

version := "0.1"

scalaVersion := "2.12.4"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "http://oss.sonatype.org/content/repositories/releases",
  "defaultMavenRepo" at "http://repo1.maven.org/maven2")
resolvers ++= Seq("scalaz-bintray" at "https://dl.bintray.com/scalaz/releases")

libraryDependencies ++= "org.specs2"    %% "specs2-core"    % "4.0.0" % "test"
libraryDependencies ++= "org.scalactic" %% "scalactic"      % "3.0.4"
libraryDependencies += "org.scalatest"  %% "scalatest_2.13.0-M2" % "3.0.4"

scalacOptions in Test ++= Seq("-Yrangepos")