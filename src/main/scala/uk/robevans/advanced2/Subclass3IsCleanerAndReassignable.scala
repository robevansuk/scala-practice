package uk.robevans.advanced2

class Subclass3IsCleanerAndReassignable(override val name: String) extends BaseClass1(name) {

  /**
    * this subclass automatically assigns the passed in parameter value to the baseClass1's name method/field value
    * and is also re-assignable due to the 'var' parameter type.
    */
  override def demo() = {
    println(s"${this.getClass} demo: ${name}")
  }

}
