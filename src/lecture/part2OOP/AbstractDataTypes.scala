package lecture.part2OOP

object AbstractDataTypes extends App {

  abstract class Animal(habitaion: String){
    val creatureType: String = "Wild"
    def eat: Unit = println(habitaion)
  }

  // Traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal("Water") with Carnivore{
    override def eat(animal: Animal): Unit = println(s"Eating ${animal.creatureType}")

    override def eat: Unit = println("Eating")
  }
  /*
   * Traits vs Abstract classes
   * 1. Both can have abstract as well as non abstract members/fields
   * 2. Traits do not have constructor parameters
   * 3. Multiple Traits may be inherited by the same class
   * 4. Traits = behaviour where as abstract class = Type of a thing
   */
}
