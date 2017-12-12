package uk.robevans.advanced2

class SubSubclass1(s: String) extends Subclass3IsCleanerAndReassignable(s) {

  /**
    * This Sub-Subclass takes a value S.
    */


  override def demo() = {
    println(s"${this.getClass} demo: ${name}")
  }

}
