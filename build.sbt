name := "spark-template-migrater"

version := "0.1"

scalaVersion := "2.11.0"

lazy val root = (project in file("."))
  .settings(
    name := "root",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "2.3.0",
      "org.apache.spark" %% "spark-sql" % "2.3.0",
      "org.apache.spark" %% "spark-streaming" % "2.3.0" % "provided",
      "com.datastax.spark" %% "spark-cassandra-connector" % "2.3.0",
      "com.couchbase.client" %% "spark-connector" % "2.3.0",
      "org.scalatest" %% "scalatest" % "3.0.6" % Test
    )
  )
