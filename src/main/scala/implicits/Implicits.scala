package implicits

trait Monoid[A] {
  def add(x: A, y: A): A
  def unit: A
}

object Implicits {

  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    override def add(x: String, y: String): String = x concat  y
    override def unit: String = ""
  }

  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    override def add(x: Int, y: Int): Int = x + y
    override def unit: Int = 0
  }

  def sum[A](list: List[A])(implicit m: Monoid[A]): A = {
    if(list.isEmpty) {
      m.unit
    } else {
      m.add(list.head, sum(list.tail))
    }
  }

  def main(args: Array[String]): Unit = {
    val listOfIntegers = List(1, 2, 3, 4)
    println(sum(listOfIntegers))
    println(sum(List("a", "b", "c", "d")))
  }

}
