package selftype

trait User {
  def read: String = "Data from file"
  def write: String = "Data written to file"
}

trait UserDB extends User {
  override def read: String = "Data from DB"
  override def write: String = "Data written to DB"
}

class Service {
  this: User =>

  def readData: String = read
  def writeData: String = write
}

object Service {
  /**
    * Here we just need to instantiate Service with the trait for which we need to access their methods.
    * @return - Service object
    */
  def apply(): Service with UserDB = new Service with UserDB
}

object Application extends App {

  val service = Service()
  print(service.readData)
}