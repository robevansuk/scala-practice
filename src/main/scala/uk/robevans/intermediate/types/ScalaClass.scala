package uk.robevans.intermediate.types

import uk.robevans.intermediate.types.ScalaObject.calculate
import uk.robevans.intermediate.ListExamples

/**
  * this is a blue print for a class and may have many instances
  * Classes in Scala may take initialisation parameters
  * Methods can be imported from any object, not just singleton objects
  */
class ScalaClass {

  def main(args: Array[String]) = {
    for (arg <- ListExamples.anotherList)
      println(arg + " : " + calculate(arg))
  }
}
