package Exercises

import java.util.NoSuchElementException

abstract class CustomList {
  /*
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list empty
   * add(int) = new list with this element added
   * toString = a string representation of the list
   */

  def head(): Int
  def tail(): CustomList
  def isEmpty(): Boolean
  def add(num: Int): CustomList
  def printElements() : String

  override def toString: String = "[" + printElements() + "]"
}

object EmptyList extends CustomList {
  override def head(): Int = throw new NoSuchElementException

  override def tail(): CustomList = throw new NoSuchElementException

  override def isEmpty(): Boolean = true

  override def add(num: Int): CustomList = new CustomListImpl(num, EmptyList)

  override def printElements(): String = " "
}

class CustomListImpl(head: Int, tail: CustomList) extends CustomList {
  override def head(): Int = head

  override def tail(): CustomList = tail

  override def isEmpty(): Boolean = false

  override def add(num: Int): CustomList = new CustomListImpl(num, this)

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
}