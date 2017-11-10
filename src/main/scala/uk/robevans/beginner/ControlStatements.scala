package uk.robevans.beginner

object ControlStatements extends App {

  def doAForLoop(args: Array[String]) = {
    var i = 0
    for (arg <- args) {
      print(arg + " ")
      i += 1
    }
    println("\b")
  }

  def doAWhileLoop(args: Array[String]) = {
    var i = 0
    while (i < args.size) {
      print(args(i) + " ")
      i += 1
    }
    println("\b")
  }

  override val args = Array("1", "2", "3", "3", "4", "5", "6", "7", "7", "8", "8")

  doAForLoop(args)
  doAWhileLoop(args)

  var i :Int = 0
  print("doWhile loop: ")
  do {
    print(s"$i ")
    i += 1
  } while (i <=10)
  println("\b")

  print("for loop 1 to 4 (inclusive): ")
  for (j <- 1 to 4)
    print(s"$j ")
  println("\b")

  print("for loop 1 until 4 (exclusive of 4): ")
  for (j <- 1 until 4)
    print(s"$j ")
  println("\b")

}
