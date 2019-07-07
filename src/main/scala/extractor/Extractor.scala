package extractor

case class FullName(firstName: Option[String], lastName: Option[String])

object FullName {
  def apply(firstName: Option[String], lastName: Option[String]): FullName = {
    new FullName(firstName, lastName)
  }

  def unapply(arg: FullName): Option[(Option[String], Option[String])] = {
    Option((arg.firstName, arg.lastName))
  }
}

object Extractor extends App {
  val fullName = FullName(Option("Ayush"), Option("Hooda"))
  val (firstName, lastName) = fullName match {
    case FullName(fname, lname) => (fname, lname)
    case _ => (None, None)
  }
  print(firstName + " " + lastName)
}
