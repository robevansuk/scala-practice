package uk.robevans.advanced2

/**
  * imports any super class methods, but not private member variables
  */
class AbstractClassImplementation(val someConstAssignment : Array[String]) extends AbstractClassExample {

  override def someMethod = someConstAssignment.length

  def main(args: Array[String]) = {
    println(someMethod)
  }
}
