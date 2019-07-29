package monoids

trait Monoid[A] {

  /**
    * Identity Operation
    * @return
    */
  def unit: A

  /**
    * Associative operation
    * @param a1 - Element of type A
    * @param a2 - Element of type A
    * @return - Combined result of above two parameters
    */
  def op(a1: A, a2: A): A

}

class IntMonoid extends Monoid[Int] {

  override def unit: Int = 0

  override def op(a1: Int, a2: Int): Int = a1 + a2

}

class StringMonoid extends Monoid[String] {
  override def unit: String = ""

  override def op(a1: String, a2: String): String = a1 + a2
}

class ListMonoid[T] extends Monoid[List[T]] {
  override def unit: List[T] = Nil

  override def op(a1: List[T], a2: List[T]): List[T] = a1 ++ a2
}