package uk.robevans.advanced

object FilteringPractice extends App {

  val filesHere = (new java.io.File(".")).listFiles

  for (file <- filesHere)
    println(file)

  println
  println("Scala Files:")
  println("--------------------------")
  for (file <- filesHere
       if file.getName.endsWith(".sbt"))
    println(file)

  /**
    * for loops are expressions in scala
    * they result in a collection determined by the
    * expressions <- clauses
    */
  println
  println("Alternative filtering:")
  println("--------------------------")
  for (file <- filesHere
       if file.isFile
       if file.getName.endsWith("sbt")) println(file)

  /**
    * nested iterations
    * adding multiple <- clauses creates nested loops
    */
  println
  println("Nested Looping:")
  println("--------------------------")
  for (file <- filesHere
       if file.isDirectory;
       listItem <- file.list()) println(listItem)


  /**
    * yielding items from list whilst iterating over them
    */
  println
  println("List 'yielded' containing items >4:")
  println("--------------------------")
  def numbers : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8)
  def numbersGreaterThanFour =
    for {
      number <- numbers
      if number > 4
    } yield number
  for (item <- numbersGreaterThanFour) print(item + " ")
  println("\b")

  /**
    * yielding items from list whilst iterating over them
    */
  println
  println("List 'yielded' containing items >4:")
  println("--------------------------")
  def numbersGreaterThanFourAndEqualToSeven =
    for {
      number <- numbers
      if number > 4
    } yield number == 7   // results in: false, false, true, false
  for (item <- numbersGreaterThanFourAndEqualToSeven) print(item + " ")
  println("\b")

}
