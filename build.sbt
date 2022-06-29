import Dependencies._

ThisBuild / scalaVersion := "3.1.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.fayimora"
ThisBuild / organizationName := "fayimora"

lazy val root = (project in file("."))
  .settings(
    name := "Lambda Scala Seed",
    libraryDependencies ++= Seq(
      lambdaJavaCore,
      lambdaJavaEvents
    )
    // libraryDependencies += scalaTest % Test
  )
  .settings(fatJarSettings)

lazy val fatJarSettings = Seq(
  assemblyJarName in assembly := "lambda-scala-seed.jar",
  assemblyMergeStrategy in assembly := {
    // case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x                             => MergeStrategy.first
  }
)
