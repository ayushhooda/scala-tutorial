package implicits

// Scala 2.10 introduced implicit classes.
// Here class's primary constructor is made available for implicit conversions
// when the class is in scope.

object ImplicitClass extends App {

  implicit class Print(x: Int)(implicit y: Int) {
    def calculateTax: Double = {
      x * 0.3 + y
    }
    def calculateSalary: Double = {
      x + 100
    }
  }

  implicit val z: Int = 3
  print(5)


}
