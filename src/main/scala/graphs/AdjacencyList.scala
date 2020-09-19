package graphs

import java.util

//scalastyle:off
object AdjacencyList extends App {

  /*case class Node(label: Int, list: List[Int])

  val adjList = Array[Node](
    Node(1, List(2)),
    Node(1, List(2, 3)),
    Node(1, List(2, 5)),
    Node(1, List(2, 4)),
    Node(1, List(6))
  )

  val templeArr = Array[Int](2, 3, 4)

  var count = 0

  for {
    templeNode <- templeArr
    node <- adjList
    if node.list.contains(templeNode)
  } yield count += 1

  print(count/6)*/

  val len = 4
  val arr: Array[Int] = Array(4,8,6,7)
  val brr: Array[Int] = Array(2,8,10,5)

  def calc(arrr: Array[Int], brrr: Array[Int], length: Int): Int = {
    var arrDeleted: Int = 0
    var brrDeleted: Int = 0
    var count = 0
    for (i <- arrr.indices) {
      if ((arrr(i) ^ arrDeleted) > brrr(i) + brrDeleted) {
        if(brrDeleted < brrr(i)) {
          brrDeleted = brrr(i)
        }
        count += 1
      } else if (arrr(i) + arrDeleted < brrr(i) + brrDeleted) {
        if(arrDeleted < arrr(i)) {
          arrDeleted = arrr(i)
        }
      }
    }
    count
  }
  print(calc(arr, brr, len))

  val N = 2
  val M = 2

  val a = Array.ofDim[Int](N, M)
  for (i <- 0 to N) {
    a(i) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  }
  a.foreach(println)
}
// scalastyle:on