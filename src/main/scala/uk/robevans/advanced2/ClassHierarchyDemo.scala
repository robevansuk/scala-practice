package uk.robevans.advanced2

object ClassHierarchyDemo extends App {

  val element1 : BaseClass1 = new Subclass1("Subclass1")
  val element2 : BaseClass1 = new Subclass2IsCleanerAndNonReassignable("Subclass2")
  val element3 : BaseClass1 = new Subclass3IsCleanerAndReassignable("Subclass3")
  val element4 : BaseClass1 = new SubSubclass1("Sub-Subclass")

  val elements = Array(element1, element2, element3, element4)

  for ( element <- elements){
    element.demo()
  }

}
