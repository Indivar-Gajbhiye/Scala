package lecture.part2OOP

object OOPBasics extends App{

  val person = new Person("Lord", 22)
  println(person.x)
  //println(person.name)
  person.greet("James")

  val anotherPerson = new Person()
  println(anotherPerson.age)
}

// class Parameters are NOT FIELDS, to have them as fields to a class use val or var keyword
//Constructor
class Person(name: String, val age: Int) {

  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says, Hi $name !")

  // multiple constructors/auxilary constructors
  def this(name: String) = this(name, 0)

  def this() = this("Default constrcutor")
}