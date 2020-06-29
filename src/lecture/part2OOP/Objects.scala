package lecture.part2OOP

object Objects extends App{

  //Scala does not have class-level functionality (does not understand "static")
  //To use class level definitions we use objects

  object Person {
    //"static"/"class" level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    // We often have factory methods in this singleton object

    def from(mother: Person, father: Person): Person = new Person("James") // from is factory method
    def apply(mother: Person, father: Person): Person = new Person("James")
  }
  // COMPANIONS
  class Person (name: String){
    // instance-level functionality
  }
  println(Person.N_EYES)
  println(Person.canFly)
  //Scala Objects are Singleton instance by default
  val mother = new Person("Mother")
  val father = new Person("Father")
  val james = Person.from(mother, father)
  val newJames = Person.apply(mother, father)
  val secondJames = Person(mother, father) // without calling the factory method apply

  // Scala Applications
  //def main(args: Array[String]): Unit -> This acts like a main method for JVM to execute and is by default provided by App class
}
