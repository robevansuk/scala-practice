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

  println("----------")



  def makeATable2 = (x:Int, y:Int, someCharacter: String)  => {
    val fillCell = (someChar:String) => print(someChar)
    val makeRow =
      (y: Array[String], someChar:String) => { y.foreach(fillCell); println }
    val table = Array.fill(x,y)(someCharacter)
    table.foreach(makeRow(_, someCharacter))
  }

  makeATable2(5, 5, "x")

  // using underscores as placeholders for whatever args are expected/implied
  def sum1 (a: Int, b:Int, c:Int) = a + b + c
  val a1 = sum1 _ // a partially applied function with 0 args supplied. a1.apply expects 3 args.
  println(s"a1(1,2,3) -> ${a1(1, 2, 3)} should = 6")
  println(s"a1.apply(2,3,4) -> ${a1.apply(2, 3, 4)} should = 9")


  // using underscores as placeholders for whatever args are expected/implied
  def sum2 (a: Int, b:Int, c:Int) = a + b + c
  val a2 = sum2 (1, _:Int , 0) // another partially applied function with 2 args supplied and 1 missing. a2.apply expects 1 arg.
  println(s"a2(1) -> ${a2(1)} should = 2")
  println(s"a2.apply(3) -> ${a2.apply(3)} should = 4")



}
