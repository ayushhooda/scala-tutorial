package scala99

import scala.annotation.tailrec

/**
  * Finding the last element of a list
  */
object Ques1 extends App {

  /**
    * Finds out the last element of list
    * @param list - list of type A
    * @tparam A - type of list
    * @return - last element of list
    */
  @tailrec
  def getLastElement[A](list: List[A]): Option[A] = {
    list match {
      case Nil => None
      case head :: Nil => Option(head)
      case _ :: tail => getLastElement(tail)
    }
  }

  //scalastyle:off
  val list = List(1, 2, 3, 4, 5, 6 , 7)
  val lastElement = getLastElement[Int](list)
  lastElement match {
    case Some(element) => println("Last Element: " + element)
    case None => println("Empty List provided")
  }

}
