import sbt._
import sbt.Keys._

object ProjecteulerscalaBuild extends Build {

  lazy val projecteulerscala = Project(
    id = "project-euler-scala",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "project-euler-scala",
      organization := "com.stevenwmerrill",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.1"
      // add other settings here
    )
  )
}
