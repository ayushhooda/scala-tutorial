package forcomprehension

// The syntax of for is closely related to the HOFs map, flatMap and filter.
// First of all, these functions can be defined in terms of for:

class TranslationOfFor {

  def map[T, U](xs: List[T], f: T => U): List[U] = {
    for {
      x <- xs
    } yield f(x)
  }

  def flatMap[T, U](xs: List[T], f: T => Iterable[U]): List[U] = {
    for {
      x <- xs
      y <- f(x)
    } yield y
  }

  def filter[T](xs: List[T], f: T => Boolean): List[T] = {
    for {
      x <- xs
      if f(x)
    } yield x
  }

}

object Application extends App {
  val obj = new TranslationOfFor
  val list = obj.map[Int, String](List(1, 2, 3, 4), x => x.toString)
  println(list)
}

// In reality, Scala compiler expresses for-expressions in terms of map, flatMap and
// a lazy variant of filter.
