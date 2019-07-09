package extractor

object SortedSequence {
  def unapplySeq(seqOfIntegers: Seq[Int]): Option[Seq[Int]] = {
    if(seqOfIntegers == seqOfIntegers.sortWith(_ < _)) {
      Option(seqOfIntegers)
    }
    else {
      None
    }
  }
}

object UnapplySeq extends App {
  val listOfIntegers = List(1, 2, 3, 4, 5)

  // Applying pattern matching
  listOfIntegers match {
    case SortedSequence(a,b,c,d,e) => print(List(a, c, e))
  }
}
