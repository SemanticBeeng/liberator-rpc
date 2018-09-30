name := "client-server"

version := "1.0"

scalaOrganization := "org.typelevel"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "1.4.0",
  "com.chuusai" %% "shapeless" % "2.3.3",
  "io.aecor" %% "liberator" % "0.3.0-SNAPSHOT",
  "org.scalactic" %% "scalactic" % "3.2.0-SNAP10",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M7" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")

scalacOptions ++= Seq(
  "-Ypartial-unification",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-Yliteral-types"
)
