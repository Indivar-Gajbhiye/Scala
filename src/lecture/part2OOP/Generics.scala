package lecture.part2OOP

object Generics extends App {

  // generic class
  class MyList[A] {
    // use the type A which is said as parameter type
  }
  // We can have any number of Type parameters
  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]
  val map = new MyMap[String,  Int]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = new MyList[A]
  }
  //Objects cannot be type parameterized in scala

  val emptyListOfIntegers = MyList.empty[Int]

  //Variance Problem
  class Animal
  class Dog extends Animal
  class Cat extends Animal

  //Q. Does a List[Cat] extends List[Animal]
  //Ans(1). Yes, List[Cat] extends List[Animal], which uses the concepts of COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat //Polymorphic behaviour
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //If this is the case, what will happen if we do animalList.add(new Dog) ??? =>we return a list of Animal

  //Ans(2). No, List[Cat] does not extends List[Animal] -> INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]
  //val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat] this statement results in compiler error

  //Ans(3). NO, List[Animal] extends List[Cat] -> CONTRAVARIANCE
  class ContraVariantList[-A]
  val contraVariantList: ContraVariantList[Cat] = new ContraVariantList[Animal]


  //Bounded Types (Solves variance problem while creating covariance collections)
  class Cage[A <: Animal](animal: A) //upper bound types, this states that type variable A refers to subtype of type Animal
  val cage = new Cage(new Dog)

  // Lower bound type, declares a type to be a supertype of another type [A >: Animal]
  /*class Zoo
  val zoo = new Cage(new Zoo)*/

  class OwnList[+T] {
    //  This solves the problem of creating covariance collections
    // We state that S will be suprer type of T and we will return more generic version of of type S
    def add[S >: T](element: S): OwnList[S] = ???
  }

}
