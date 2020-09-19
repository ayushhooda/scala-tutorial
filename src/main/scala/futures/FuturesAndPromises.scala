package futures

import java.io.FileNotFoundException

import scala.util.{Failure, Success, Try}
import scala.concurrent.{Await, Future, Promise}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object FuturesAndPromises extends App {

  //scalastyle:off

  /**
    * ExecutionContext - controls the thread pool in which future execute
    */

  def add(x: Int, y: Int): Future[Int] = {
    Future.successful(x + y)
  }

  add(2, 3).onComplete {
    case Success(res) => print(s"OnComplete result: $res")
    case Failure(exception) => throw exception
  }

  add(2, 3).map(res => print(s"Map result: $res"))

  print(s"Await result" + Await.result(add(2, 3), Duration.Inf))

  // Handling Failures
  // Here normal try catch donot work, as execution happen on different thread

  add(2, 3) recover {
    case _: Exception => 0
  }

  add(2, 3) recoverWith {
    case _: Exception => Future(5)
  }

  add(2, 3) fallbackTo Future(5)

  Thread.sleep(500)

  // Promises

  val p = Promise[Int]()
  val f = p.future

  val sum = p success 5

  val x = Future (6 / 0) recover { case _: ArithmeticException => 0 } // result: 0
  val y = Future (6 / 0) recover { case _: FileNotFoundException   => 0 } // result: exception
  val z = Future (6 / 2) recover { case _: ArithmeticException => 0 } // result: 3

  print(s"\nx = $x and y = $y and z = $z")

  Thread.sleep(1000)


  val list1 = List(1, 2, 3)
  val list2 = List("a", "b", "c")
  val res = List[(Int, String)]()
  var g = -1
  val dd = list1.foldLeft[List[(Int, String)]](List()){(accum, element) => g+=1; accum :+ (element, list2(g))}
  println("ll"+dd)
//  list1.fold()

  val r = Future.sequence(Seq(add(2,3), add(3,4)))


  //scalastyle:on

}
