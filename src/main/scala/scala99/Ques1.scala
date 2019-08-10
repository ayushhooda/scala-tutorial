package scala99

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
  def getLastElement[A](list: List[A]): Option[A] = {
    def innerFunc(list: List[A]): Option[A] = {
      list match {
        case Nil => None
        case head :: Nil => Option(head)
        case _ :: tail => innerFunc(tail)
      }
    }

    innerFunc(list)
  }

  /*def getLastButOneElement[A](list: List[A]): Option[A] = {
    def innerFunc(list: List[A]): Option[A] = {
      list match {
        case Nil || (head1 :: head2 :: tail) =>
      }
    }
  }*/

  //scalastyle:off
  val list = List(1, 2, 3, 4, 5, 6 , 7)
  val lastElement = getLastElement[Int](list)
  println(lastElement.get)

}
