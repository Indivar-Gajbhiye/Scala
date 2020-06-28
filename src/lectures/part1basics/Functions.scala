package lectures.part1basics

object Functions extends App{

  def aFunc(str: String, value: Int): String = {
    str + " " + value
    //value = value + 1
  }

  println(aFunc("Indi", 22))

  def aParameterLessFunc() = 42
  println(aParameterLessFunc)

  def aRepeatedFunc(oneStr: String, num: Int): String = {
    if (num == 1) oneStr
    else oneStr + aRepeatedFunc(oneStr, num -1 )
  }
  println(aRepeatedFunc("World", 4))
  // WHEN YOU NEED LOOPS, USE RECURSION

  /*
   * 1. A greeting function (name, age) => Display message
   * 2. Factorial Function => 1*2*3....n
   * 3. A fibonacci function => f(1) = 1, f(2) = 1, f(n) = f(n-1) + f(n-2)
   * 4. Tests if a number is a prime number
   */

  // Greeting Function
  def greeting(name: String, age: Int): String = {
      "Hi, My name is " + name + " and my age is " + age + " years old"
  }
  println(greeting("Dave", 55))

  def factorial(num: Int): Int = {
    if (num == 1) 1
    else num * factorial(num - 1)
  }
  println(factorial(9))

  def fibonacci(num: Int): Int = {
    if (num <= 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)
  }
  println(fibonacci(3))
}
