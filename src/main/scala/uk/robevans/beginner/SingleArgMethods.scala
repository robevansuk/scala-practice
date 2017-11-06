package uk.robevans.beginner

object SingleArgMethods extends App {

  val greetings : Array[String] = new Array[String](10)

  greetings(0) = "Hello World"
  greetings(1) = "Hi World"
  greetings(2) = "Hey World"
  greetings(3) = "Howdy World"
  greetings(4) = "G'day World"
  greetings(5) = "Bonjour World"
  greetings(6) = "Guten tag World"
  greetings(7) = "Shalom World"
  greetings(8) = "Ciao World"
  greetings(9) = "Hola World"


  for (i <- 0 to 9) // 0.to(9) <- single arg method needs no dot notation or parentheses
    println(greetings(i))
}
