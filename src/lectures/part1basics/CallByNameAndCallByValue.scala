package lectures.part1basics

object CallByNameAndCallByValue extends App {

  def callByValue(num: Long): Unit = {
    println("Call By Value: "+ num)
    println("Call By Value: "+ num)
  }

  // => Indicates lazy evaluation and function is directly passed as argument for num
  def callByName(num: => Long): Unit = {
    println("Call By Name: "+ num)
    println("Call By Name: "+ num)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Unit = println(infinite())

  def printFirst(x: Int, y: => Unit) = println(x)

  printFirst(34, infinite())

  /*
   * Summary:
   * 1. Call By Value:
   *    a. value is computed before the call
   *    b. same value is used everywhere
   * 2. Call By Name: (=> arrow syntax)
   *    a. expression is passed literally
   *    b. experssion is evaluated at every use within
   *
   */
}
