package genericclass

class MyStack[A](elems: List[A]) {

  /**
    * Checks if this stack is empty.
    * @return true, iff there is no element on the stack
    */
  def isEmpty: Boolean = elems.isEmpty

  /**
    * Push an element on the stack.
    * @param elem - the element to push on the stack.
    * @return - the stack with the new element on top.
    */
  def push(elem: A): List[A] = {
    elem :: elems
  }

  /**
    * Removes the top element from the stack.
    * @return - the new stack without the former top element.
    */
  def pop: List[A] = {
    if(!isEmpty) {
      elems.tail
    }
    else {
      throw new NoSuchElementException("pop of empty stack")
    }
  }

}
