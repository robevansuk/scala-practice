package uk.robevans.advanced2

class Subclass2IsCleanerAndNonReassignable(override val name: String) extends BaseClass1(name) {

  /**
    * in this example the name is supplied as a constructor parameter.
    * This value is not reassignable because we preceeded name with 'val'.
    */

  override def demo() = {
    println(s"${this.getClass} demo: ${name}")
  }

}
