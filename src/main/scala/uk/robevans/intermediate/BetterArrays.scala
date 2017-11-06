package uk.robevans.intermediate

object BetterArrays extends App {

  val greetings = Array("Hello", "Hi", "Hey", "Howdy", "G'day", "Bonjour", "Guten tag", "Shalom", "Ciao", "Hola")

  for (i <- 0 to 9)
    println(greetings(i) + " World")
}
