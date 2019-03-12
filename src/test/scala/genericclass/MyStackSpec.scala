package genericclass

import org.scalatest.FunSuite

class MyStackSpec extends FunSuite {

  //scalastyle:off
  val list = List(1, 2, 3, 4)
  val stack = new MyStack[Int](list)

  test("Stack: push functionality") {
    assert(stack.push(5) === List(5, 1, 2, 3, 4))
  }

  test("Stack: pop functionality") {
    assert(stack.pop === List(2, 3, 4))
  }

  test("Stack: check if it's empty") {
    assert(!stack.isEmpty)
  }
  //scalastyle:on
}
