package Exercises

import java.util.NoSuchElementException

abstract class CustomList[+T] {
  /*
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list empty
   * add(int) = new list with this element added
   * toString = a string representation of the list
   */

  def head(): T
  def tail(): CustomList[T]
  def isEmpty(): Boolean
  def add[S >: T](num: S): CustomList[S]
  def printElements() : String

  override def toString: String = "[" + printElements() + "]"
}

//Nothing is super class of all the classes in Scala
object EmptyList extends CustomList[Nothing] {
  override def head(): Nothing = throw new NoSuchElementException

  override def tail(): CustomList[Nothing] = throw new NoSuchElementException

  override def isEmpty(): Boolean = true

  override def add[S >: Nothing] (num: S): CustomList[S] = new CustomListImpl(num, EmptyList)

  override def printElements(): String = " "
}

class CustomListImpl[+T](head: T, tail: CustomList[T]) extends CustomList[T] {
  override def head(): T = head

  override def tail(): CustomList[T] = tail

  override def isEmpty(): Boolean = false

  override def add[S >: T](num: S): CustomList[S] = new CustomListImpl(num, this)

  override def printElements(): String = {
    if (tail.isEmpty()) "" + head
    else head + "," + tail.printElements()
  }
}

object CustomListTest extends App {
  val list = new CustomListImpl(1, new CustomListImpl(10, new CustomListImpl(20, EmptyList)))
  //val list = new CustomListImpl(1, EmptyList)
  println(list.head())
  println(list.add(4).toString())

  println(list.toString)

  val listOfIntegers = new CustomListImpl(10, new CustomListImpl(100, EmptyList))
  val listOfStrings = new CustomListImpl("Scala",  new CustomListImpl("learning", EmptyList))

  println(listOfIntegers)
  println(listOfStrings)
}