package lecture.part2OOP

object AnonymousClasses extends App {

  abstract class Animal {
    def action(): Unit
  }

  val dog = new Animal {
    override def action(): Unit = println("Bark")
  }
  val cat = new Animal {
    override def action(): Unit = println("Meoww")
  }

  class Person(name: String) {
    def greet(): Unit = println(name)
  }
  dog.action()
  println(dog.getClass)
  cat.action
  println(cat.getClass)
  val person = new Person("Indi")
  person.greet()
}
