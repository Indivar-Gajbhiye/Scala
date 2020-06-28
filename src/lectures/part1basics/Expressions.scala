package lectures.part1basics

object Expressions extends App {
  val x=2+3*4
  println(x)

  val play = 4 | 10 // bitwise operators
  println(play)

  //Instructions (Do something) vs Expressions(has values and/or a type)

  // IF Expression, the if statement gives back a value hence termed as IF Expression

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  // Discourage use of loops in scala, which introduces side effects

  // Every thing in scala is expressions, only definitions of a val or a class or a package is not expression

  var aVar = 10
  val weirdVal = (aVar = 3)

  println(weirdVal) // unit is a special type of value which is similar to void in Java
  // Side effects in scala are expression returning Unit value
  // side effects: println, while loops, reassigning variables

  val codeBlocks = {
    val x = 11
    val y = x - 2

    if(y == 9) "True" else "false"
    val z= {
      val nestedVal = 10
    }
  }
  println(codeBlocks)

  // CodeBlocks: they are also expressions in scala
  //value of a code block is the value of its last expression

  val newVal = {
    2 < 3
    22
  }
  println(newVal)
}
