
class Assignment {

  def findNumberOfWays(R: Int, P: Int): Int = {

    def innerFunc(R: Int, P: Int, AryaPoints: Int, SansaPoints: Int): Int = {
      R match {
        case r if(r > 0) && (AryaPoints >= P * SansaPoints) =>
          innerFunc(R - 1, P, AryaPoints + 1, SansaPoints) + innerFunc(R - 1, P, AryaPoints, SansaPoints + 1)
        case r if(r == 0) && (AryaPoints >= P * SansaPoints) => 1
        case _ => 0
      }
    }

    innerFunc(R, P, 0, 0)

  }

}

object Assignment {

  def main(args: Array[String]): Unit = {

    val obj = new Assignment

    /*
    Constraints
    1<= T <=10
    1<= R <=1000
    1<= P <=R
    */

    // Number of test cases.
    var T = scala.io.StdIn.readInt

    while (T > 0) {
      // Number of Rounds.
      val R = scala.io.StdIn.readInt

      // Factor by which Arya's points should be atleast more than Sansa's points.
      val P = scala.io.StdIn.readInt

      val numberOfWays = obj.findNumberOfWays(R, P)

      print("==========>" + numberOfWays)

      T = T - 1
    }

  }
}
