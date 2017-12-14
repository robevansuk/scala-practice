package uk.robevans.advanced3

/**
  * a class can only extend a single object however
  * it can also mix-in many 'traits' to include
  * well defined, encapsulated functionality. This
  * enables us to turn thin interfaces into rich interfaces.
  * For one trait use 'extends', if you are adding many traits
  * after a single extends use, use 'with Bantz'
  */
class RobEvans extends Bantz {

  override def toString : String = banter()

}

object RobEvans extends App {
  println(toString)
}
