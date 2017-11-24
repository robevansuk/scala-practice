package uk.robevans.advanced

/**
  * Functions are like methods but there are a number of types of function
  * Functions that are members of objects - aka methods if you're coming from the java world
  * functions nested within functions
  * function literals
  * function values
  *
  * Benefits of private methods/code encapsulation are hiding complexity and reducing code pollution
  * Programs should be broken down in to many smaller functions that are well defined and do one job well
  */
object Functions extends App {

  // A basic function definition - could be a var if you wanted to change it at a later date
  val addOne = (x: Int) => x + 1
  println(s"Add one to 1 = addOne(1) = ${addOne(1)}")

  // multiline function
  val multilineAddOne = (x: Int) => {
    println("Hello")
    println("world!")
    println(x+100)
  }
  multilineAddOne(1)

  // We can also define functions within functions - local functions
  def makeATable1 = (x: Int, y: Int, someCharacter: String)  => {
    val makeRow =
      (y: Array[String], someChar:String) => println(y.mkString(someChar))
    val table: Array[Array[String]] = Array.fill(x,y)(someCharacter)
    table.foreach(makeRow(_, someCharacter))
  }

  makeATable1(5, 5, "x")


  def makeATable2 = (x:Int, y:Int, someCharacter: String)  => {
    val makeRow =
      (y: Array[String], someChar:String) => println(y.mkString(someChar))
    val table = Array.fill(x,y)(someCharacter)
    table.foreach(makeRow(_, someCharacter))
  }

  makeATable2(5, 5, "x")
}
