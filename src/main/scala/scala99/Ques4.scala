package scala99

import scala.annotation.tailrec

// Find the number of elements of a list.
class Ques4 {

  def numOfElements[A](list: List[A]): Int = {
    @tailrec
    def innerFunc(list: List[A], length: Int): Int = {
      list match {
        case Nil => length
        case _ :: tail => innerFunc(tail, length + 1)
      }
    }
    innerFunc(list, 0)
  }

}

object Ques4 extends App {
  val ques4 = new Ques4
  //scalastyle:off
  val list = List(1, 2, 3)
  println(ques4.numOfElements(list))
}
