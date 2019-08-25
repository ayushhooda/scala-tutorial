package scala99

import scala.annotation.tailrec

// Find the Kth element of a list.
class Ques3 {

  def findKthElement[A](list: List[A], k: Int): Option[A] = {

    @tailrec
    def innerFunc(list: List[A], count: Int, element: Option[A]): Option[A] = {
      list match {
        case Nil => element
        case head :: tail if count != 0 => innerFunc(tail, count - 1, Option(head))
        case _ :: _ if count == 0 => element
      }
    }
    if(k <= 0 || k > list.length) {
      None
    } else {
      innerFunc(list, k, None)
    }
  }
}

object Ques3 extends App {

  val ques3 = new Ques3
  //scalastyle:off
  val list = List(1, 2, 3, 4)
  println(ques3.findKthElement(list, 1))

}