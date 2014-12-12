name := "slick-direct"

version := "1.0"

mainClass in Compile := Some("SimpleExample")

libraryDependencies ++= List(
  TypesafeLibrary.scalaCompiler.value,
  TypesafeLibrary.slick.value,
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.170"
)
