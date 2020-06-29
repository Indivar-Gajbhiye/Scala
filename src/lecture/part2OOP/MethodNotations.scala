package lecture.part2OOP

object MethodNotations extends App {

  class Person(val name: String, favMovie: String) {
    def apply(): String = "Apply method implementation"

    def likes(movie: String): Boolean = movie == favMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name exclaims"
    def isIntelligent: Boolean = true
    //def apply(): String = s"My name is $name"
  }

  val person = new Person("Lord", "InterStellar")
  println(person.likes("InterStellar"))
  println(person likes "InterStellar") // Lines 10 and 11 are equivalent
  // infix notation or Operator Notation which works only for methods having one parameter (syntactic sugar)

  val anotherPerson = new Person("James", "Shutter Island")
  println(person hangOutWith anotherPerson)
  // All Operators in scala are methods exmaples are(+, -)


  //Prefix Notations
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  //unary prefix works only with - + ~ !
  println(x)
  println(y)
  println(!person)
  println(person.unary_!)

  //Postfix Notations (only available for methods with no parameters)
  println(person.isIntelligent)
  println(person isIntelligent)

  // apply method
  //println(anotherPerson.apply())
  println(anotherPerson())
}


