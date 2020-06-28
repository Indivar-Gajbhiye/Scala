package lecture.part2OOP

object MethodNotationsExercise extends App {

  /*
   * 1. Overload the + operator
   *    mary + "the rockstar" => new Person "Mary (the rockstar)"
   *
   * 2. Add an age to the Person class
   *    Add a unary + operator => new person with age + 1
   *    +mary => mary with age incementor
   *
   * 3. Add a learns method in Person class => "Mary learns scala"
   *    Add a learnsScala method, calls learns method with "Scala"
   *    Use it in postFix Notation
   *
   *  4. Overload the apply method
   *      mary.apply(2) => "Mary watched Interstellar 2 times"
   */
  class Person(val name: String, favMovie: String, val age: Int = 0) {
    def apply(): String = s"$name"
    def +(nickName : String): Person = new Person(name +" ("+nickName+") ", favMovie)
    def unary_+ : Person = new Person(name, favMovie, age + 1)
    def learns(subject: String): String = s"$name learns $subject"
    def learnsScala(): String = {
      this learns "Scala"
    }
    def apply(num :Int): String = s"$name watched $favMovie $num times"
  }
  val person = new Person("Lord", "Blood Diamond")
  println((person + "Creator")())
  println((+person).age)

  println(person.learns("Scala"))
  println(person learnsScala()) // postfix Notation

  println(person.apply(3))
}
