package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(num: Int): Int = {
    if (num == 1) 1
    else{
      println(num)
      val result = num * factorial(num - 1)
      println(num)

      result
    }
  }
  //println(factorial(5000))

  def anotherFact(num : BigInt): BigInt = {
    @tailrec
    def factHelper(num: BigInt, accumulator: BigInt): BigInt =
      if (num <= 1)accumulator
      else factHelper(num - 1, num * accumulator) //TAIL RECURSION- use recursive call at the LAST expression

    factHelper(num, 1)
  }
  //println(anotherFact(1000))

  // Whenever you want loops, use TAIL RECURSION

  /**
   * 1. Concatenate a string n times
   */

    @tailrec
  def concatTimes(input: String, num: Int, accumulator: String): String = {
    if (num <= 0) accumulator
    else concatTimes(input, num -1, input + accumulator)
  }
  println(concatTimes("indi",  5, ""))

  /**
   * 2. Number is a prime number using tail recursion
   */
// Using Auxilary Functions
  def isPrimeTailRec(num: Int): Boolean = {
    @tailrec
    def isPrimeInnerTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) return false
      else if (t<=1) return true
      else isPrimeInnerTailRec(t-1, num%t != 0 && isStillPrime)
    }
    isPrimeInnerTailRec(num / 2, true)
  }
  println(isPrimeTailRec(17))
  println(isPrimeTailRec(2003))

  /**
   * 3. Fibonacci Series
   */

  def fibonacci(num: Int): Int = {

    def fibonacciTailRec(t: Int, last: Int, nextToLast: Int): Int = {
      if (t >= num) last
      else fibonacciTailRec(t + 1, last + nextToLast, last)
    }
    if (num<=2) 1
    else fibonacciTailRec(2, 1,1 )
  }

  println(fibonacci(8))
}
