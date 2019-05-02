resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.0")

// web plugins

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.4")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

