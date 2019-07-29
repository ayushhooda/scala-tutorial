package jsonhelper

import jsonhelper.JsonUtils._
import org.scalatest.FunSuite

class JsonUtilsSpec extends FunSuite {

  case class Person(name: String, address: Option[String] = None)
  val person = Person("Ayush")

  test("JsonUtils: toJson functionality") {
    assert(toJson(person) === """{"name":"Ayush"}""")
  }

  test("JsonUtils: toCase functionality") {
    assert(toCase[Person]("""{"name":"Ayush"}""").map(_.name).get === person.name)
  }
}
