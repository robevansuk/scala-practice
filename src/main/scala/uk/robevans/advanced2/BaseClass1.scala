package uk.robevans.advanced2

abstract class BaseClass1(val name: String) {

//  def name : String // parameterless method/field - treating this as a field in this example see Subclass 1/2/3 for usages - declared using 'def'

  def demo() = {
    println(s"${this.getClass} demo: ${name}")
  }
}
