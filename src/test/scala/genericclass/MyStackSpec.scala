package genericclass

import org.scalatest.FunSuite

class MyStackSpec extends FunSuite {

  //scalastyle:off
  test("Stack: push functionality") {
    val list = List(1, 2, 3, 4)
    val stack = new MyStack[Int](list)
    assert(stack.push(5) === new MyStack[Int](List(1, 2, 3, 4, 5)))
  }

  test("Stack: pop functionality") {
    val list = List(1, 2, 3, 4)
    val stack = new MyStack[Int](list)
    assert(stack.pop === new MyStack[Int](List(2, 3, 4)))
  }
  //scalastyle:on
}
