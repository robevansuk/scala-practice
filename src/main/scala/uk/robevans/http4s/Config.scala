package uk.robevans.http4s


case class Config(port: Config.Port)

object Config {
  case class Port(value: Int)       extends AnyVal
}
