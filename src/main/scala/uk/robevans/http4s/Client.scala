package uk.robevans.http4s

import cats.effect.IO
import org.http4s.Uri
import org.http4s.client.blaze._
import org.http4s.client._
//import cats._
//import cats.effect._
//import cats.implicits._

object Client extends App {

//  import scala.concurrent.ExecutionContext.Implicits.global

  val httpClient: Client[IO] = Http1Client[IO]().unsafeRunSync

  def hello(): IO[String] =  {
    val target = Uri.uri("http://localhost:8080/hello")
    httpClient.expect[String](target)
  }

  def result = hello().unsafeRunSync
  println(result)

}
