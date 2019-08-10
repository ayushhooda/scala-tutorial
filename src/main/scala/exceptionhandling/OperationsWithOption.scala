package exceptionhandling

object OperationsWithOption {

  def mean(seqOfIntegers: Seq[Double]): Option[Double] = {
    if(seqOfIntegers.isEmpty) {
      None
    } else {
      Some(seqOfIntegers.sum / seqOfIntegers.length)
    }
  }

}
