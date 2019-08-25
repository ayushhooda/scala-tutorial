package scala99

import scala.annotation.tailrec

// Find the last but one element of a list.
class Ques2 {

  def findSecondLastElement[A](list: List[A]): Option[A] = {
    @tailrec
    def innerFunc(list: List[A], element: Option[A]): Option[A] = {
      list match {
        case Nil | _ :: Nil => element
        case first :: second :: tail => innerFunc(second :: tail, Option(first))
      }
    }
    innerFunc(list, None)
  }
}

object Ques2 extends App {

  val ques2 = new Ques2
  //scalastyle:off
  val list = List(1, 2, 3, 4, 5, 6)
  println(ques2.findSecondLastElement(list))

}
