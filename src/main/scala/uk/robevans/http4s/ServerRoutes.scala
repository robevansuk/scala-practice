package uk.robevans.http4s

import cats.effect.Effect
import org.http4s.HttpService
import org.http4s.circe._
import org.http4s.dsl.Http4sDsl
import io.circe.literal._
import scala.language.higherKinds

class ServerRoutes[F[_]: Effect](serverConfig: Config) extends Http4sDsl[F] {

  val service : HttpService[F] = {
  HttpService[F] {
    case GET -> Root / "hello" =>
      Ok(json"""{"helllooooo": "world"}""")
    case GET -> Root / "world" =>
      Ok(json"""{"World":"Hello"}""")
    }
  }

}
