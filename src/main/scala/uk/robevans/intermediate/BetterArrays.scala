package uk.robevans.intermediate

object BetterArrays extends App {

  val greetings: Array[String] = Array("Hello", "Hi", "Hey", "Howdy", "G'day", "Bonjour", "Guten tag", "Shalom", "Ciao", "Hola")

//  for (i <- 0 to 9)
//    println(greetings(i) + " World")

  greetings.map{"for each " + _}.foreach { println }
  greetings.map{ _ + "!"}.foreach{ println }
  greetings.take(10).map{ _ + "!!!"}.foreach{println}
  greetings.takeWhile{_.startsWith("H")}.foreach{println}
  println(greetings.takeRight(2).mkString(" "))

  def outputSomeInfo(value : String) :Unit = {

  }
}
