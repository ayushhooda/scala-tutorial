package exceptionhandling

class OperationsWithEither {

  def mean(seqOfIntegers: Seq[Double]): Either[String, Double] = {
    if(seqOfIntegers.isEmpty) {
      Left("mean of empty list")
    } else {
      Right(seqOfIntegers.sum / seqOfIntegers.length)
    }
  }

}

object OperationsWithEither {

  def apply(): OperationsWithEither = new OperationsWithEither()

}

object Application extends App {
  val obj = OperationsWithEither()
  val sumOfSeq1 = obj.mean(Seq(1, 2, 3, 4))
  val sumOfSeq2 = obj.mean(Seq())
  println(sumOfSeq1)
  println(sumOfSeq2)
}