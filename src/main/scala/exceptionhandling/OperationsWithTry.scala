package exceptionhandling

import scala.util.{Failure, Success, Try}

class OperationsWithTry {

  def mean(seqOfIntegers: Seq[Double]) = {
    Try {
      seqOfIntegers.sum / seqOfIntegers.length
    } match {
      case Success(value) => value
      case Failure(exception) =>
    }
  }

}
