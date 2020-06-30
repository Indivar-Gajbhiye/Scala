package lecture.part2OOP

object InheritanceAndTraits extends App {

  // Scala has three access specifiers/modifiers private, protected and public(which is default)
  // Scala supports single class Inheritance
  class Animal{
    val creatureType = "wild"
    def eat = println("Eating")
  }

  class Cat extends Animal

  val cat = new Cat
  //cat.eat

  //Constructors
  class Person(name: String, age: Int)
  //class Adult(name: String, age: Int, idCard: String) extends Person -> This line will give error as it will not find matching constructors in Person parent class
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  //overriding applicable for non private members(val and var) and methods both
  //We can override var/val of super class from constructor of child class
  class Dog(override val creatureType: String) extends Animal {
    override def eat: Unit = println("Biting")
  }
  val dog = new Dog("Doggo")
  dog.eat
  val dogTest = new Animal
  dogTest.eat

  // Type Substiution
  val unknownAnimal: Animal = new Dog("Doggos")
  unknownAnimal.eat

  //sealed keyword is a soft restriction on extending your class. you can extend the class which is declared within the same file
}
