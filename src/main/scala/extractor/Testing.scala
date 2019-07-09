package extractor

case class ModuloCheck(num: Int)

object ModuloCheck {
  def unapply(num: ModuloCheck): Boolean = {
    if(num.num % 5 == 0) {
      true
    } else {
      false
    }
  }
}

object Testing extends App {
  val num = 10
  val moduloNum = ModuloCheck(num)
  ModuloCheck.unapply(moduloNum) match {
    case testValue if testValue => print(s"${moduloNum.num} is divisible by 5")
    case _ => print(s"${moduloNum.num} is not divisible by 5")
  }
}
