package jsonhelper

import org.json4s._
import org.json4s.native.Serialization._
import org.json4s.native.JsonMethods._

import scala.reflect.ManifestFactory

object JsonUtils {

  implicit val formats: DefaultFormats.type = DefaultFormats
  implicit val mf: ManifestFactory.type = scala.reflect.Manifest

  def toJson[A](a: A): String = write[A](a)

  def toCase[A](json: String)(implicit mf: scala.reflect.Manifest[A]): Option[A] = parseOpt(json).flatMap(_.extractOpt[A])

}
