/*
package monads

class MyList[A] {

  def map[T, U](list: MyList[T], f: T => U): MyList[U] = {
    for {
      l <- list
    } yield f(l)
  }

  def flatMap[T, U](list: MyList[T], f: T => MyList[U]): MyList[U] = {
    for {
      l <- list
      x <- f(l)
    } yield x
  }
}
*/
