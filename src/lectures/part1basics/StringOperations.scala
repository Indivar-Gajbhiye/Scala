package lectures.part1basics

object StringOperations extends App {

  val str: String = "Functional Programming with Scala"

  // Java based operations as Scala uses JVM and has access to String.class
  println(str.split(" ").toList)
  println(str.length())
  println(str.length)

  // Scala specific implementations
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a'+: aNumberString:+ 'z') // +: is perfix operator and :+ is a suffix operator
  println(str.reverse)
  println(str.take(3))

  // Scala String Interpolators

  //1. S-interpolators
  val name = "Lord"
  val age = 27
  val greeting = s"Hello, this is $name and it has age as $age"
  println(greeting)

  //2. F-interpolators For formatted strings
  val speed = 11.2f
  val string = f"$name can walk at speed of $speed%7.3f km/h"
  println(string)
  /* println(f"$name%s can walk at speed of $speed%2.2f km/h")
   * Also check for type correctness while expanding value,
   * val x = 1.1f -> value is float
   * val str = f"$x%3d" -> format requires int
   */

  //3. raw-interpolator
  println(raw"This is a \n newline")
  val line = "This is a \n newline"

  println(raw"$line")

}
