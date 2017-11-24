package uk.robevans.advanced

/**
  * Functions are like methods but there are a number of types of function
  * Functions that are members of objects - aka methods if you're coming from the java world
  * functions nested within functions
  * function literals
  * function values
  */
object Functions extends App {

  // A basic function definition
  val addOne = (x: Int) => x + 1

  println(s"Add one to 1 = addOne(1) = ${addOne(1)}")



}
