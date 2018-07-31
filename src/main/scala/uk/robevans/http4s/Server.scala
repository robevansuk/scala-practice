
import cats.effect.{Effect, IO}
import fs2.StreamApp
import org.http4s.HttpService
import org.http4s.server.blaze.BlazeBuilder
import org.slf4j.LoggerFactory
import uk.robevans.http4s.Config.Port
import uk.robevans.http4s.{Config, ServerRoutes}

import scala.concurrent.ExecutionContext
import scala.language.higherKinds

object Server extends StreamApp[IO] {

  import scala.concurrent.ExecutionContext.Implicits.global

  val logger = LoggerFactory.getLogger(getClass)

  val serverConfig: Config = Config (
    Port(8080)
  )

  def stream(args: List[String], requestShutdown: IO[Unit]): fs2.Stream[IO, StreamApp.ExitCode] = ServerStream.streamp[IO]
}

object ServerStream {
   import Server._

  def serverRoutes[F[_]: Effect]: HttpService[F] = new ServerRoutes[F](serverConfig).service

  def streamp[F[_]: Effect](implicit ec: ExecutionContext): fs2.Stream[F, StreamApp.ExitCode] = {
    logger.info(s"Server started on port: ${serverConfig.port.value}")
    BlazeBuilder[F].bindHttp(serverConfig.port.value, "0.0.0.0").mountService(serverRoutes, "/").serve
  }
}