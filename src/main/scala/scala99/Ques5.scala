package scala99

// Reverse a list
class Ques5[T] {

  def reverseList[A](list: List[A]): List[A] = {
    def innerFunc(list: List[A], reversedList: List[A]): List[A] = {
      list match {
        case Nil => reversedList
        case head :: tail => innerFunc(tail, head :: reversedList)
      }
    }
    innerFunc(list, Nil)
  }

  def reverseFunctional[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]()){(first, second) => second :: first}
  }
}

object Ques6 extends App {
  val ques5 = new Ques5
  //scalastyle:off
  println(ques5.reverseList(List(1,2,3,4)))
}