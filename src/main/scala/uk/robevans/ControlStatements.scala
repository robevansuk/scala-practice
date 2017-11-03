package uk.robevans

object ControlStatements extends App {

  def doAForLoop(args : Array[String])  = {
    var i = 0
    for (arg <- args) {
      if (i != args.size-1) {
        print(arg + ", ")
      } else {
        print(arg)
      }
      i+=1
    }
    println()
  }

  def doAWhileLoop(args: Array[String])  = {
    var i = 0
    while ( i < args.size ) {
      if (i != 0) print(", ")
      print(args(i))
      i += 1
    }
    println()
  }

  override val args = Array("1", "2", "3", "3", "4", "5", "6", "7", "7", "8", "8")

  doAForLoop(args)
  doAWhileLoop(args)
}
