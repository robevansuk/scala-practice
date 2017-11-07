package uk.robevans.intermediate

object Tuples extends App {

  val pair = (99, "Luftballons")
  println(pair._1)
  println(pair._2)

  val items = (1, "two", 3, "four", true, false, Nil, 8, "nine", "ten")
  println(items._1)
  println(items._2)
  println(items._3)
  println(items._4)

}
