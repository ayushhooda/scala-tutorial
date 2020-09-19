package monads

class Bag[A](peanut: A) {

  // unit
  def apply(peanut: A): Bag[A] = new Bag(peanut)

  // map
  def map[B](f: A => B): Bag[B] = {
    new Bag(f(peanut))
  }

  // flatMap
  def flatMap[B](f: A => Bag[B]): Bag[B] = {
    f(peanut)
  }

}

object Test extends App {
  val bag1 = new Bag[Int](1)
  val bag2 = new Bag(new Bag[Int](1))
  bag1.map(x => x * 2)
  bag2.flatMap(identity)
}
