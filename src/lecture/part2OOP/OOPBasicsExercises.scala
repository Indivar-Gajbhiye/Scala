package lecture.part2OOP

object OOPBasicsExercises extends App {

  /*
   *Novel and Writer
   * Writer : first name, surname and year
   * methods - fullName
   *
   * Novel: name, year of release, Author
   * - authorAge
   * - isWritternBy
   * - copy (new year of release) = new instance of novel
   *
   * Counter Class
   *  - receives an int value
   * - method current count
   * - method to increment/decrement => new Counter
   * - Overload inc/dec to receive an amount => new Counter
   *
   */

  val author = new Writer("Khaled", "Hossieni", 1960)
  val novel = new Novel("The Kite Runner", 2000, author)
  println(novel.authorAge())

  val count = new Counter()
  //count.incrementCounter().print

  count.inc.inc.print
  count.dec.dec.dec.dec.print
}

class Writer(firstName: String, surname: String, val year: Int) {

  def fullName(): String  = firstName + " " + surname
}

class Novel(val name: String, val releaseYear: Int, val author: Writer) {

  def authorAge() : Int = releaseYear - author.year
  def isWrittenBy(author: Writer) : Boolean = author == this.author // imp check for equality
  def copy(newYear: Int) : Novel = new Novel(name, newYear, author)
}

class Counter(val counter: Int = 0) {
  //def currentCount(): Int = counter
  def incrementCounter(): Counter = new Counter(counter + 1) // Immutability
  def decrementCounter(): Counter = new Counter(counter - 1)

  def incrementParamCounter(factor: Int): Counter = new Counter(counter + factor)
  def decrementParamCounter(factor: Int): Counter = new Counter(counter - factor)

  def print = println(counter)

  // Using recursion way and overloaded methods
  def inc = {
    println("Incrementing the counter")
    new Counter(counter + 1)
  }
  def dec = {
    println("Decrementing the counter")
    new Counter(counter - 1)
  }

  def inc(param: Int) : Counter = {
    if (param<=0) this
    else inc.inc(param - 1)
  }

  def dec(param: Int) : Counter = {
    if (param<=0) this
    else dec.dec(param - 1)
  }
}