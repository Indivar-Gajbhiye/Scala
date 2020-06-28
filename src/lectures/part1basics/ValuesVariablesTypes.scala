package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 11
  println(x)

  // Vals are Immutable, usually used to create an intermediate sql operation part of big sql operation
  var y = "String type"
  println(y)

  y = "Change"
  println(y)
}
