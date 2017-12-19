package uk.robevans.advanced4

/**
  * Case classes enable you to pattern match on objects without
  * requiring a large amount of boilerplate. Just declare
  * a class with "case" at the beginning of the class definition.
  *
  * we will also cover the role of sealed classes and Option type.
  *
  * Declaring a case class has 3 advantages:
  *
  * 1. it adds a factory method to it with the name of the class.
  * This means you can write:
  * def foo = Foo("x")
  * rather than:
  * def foo = new Foo("x")
  *
  * 2. All arguments in the parameter list get a val prefix so they become fields
  *
  * 3. Natural implementations of toString, hashCode and equals are added to your class
  * equals will compare the whole object tree,
  *
  *
  */
case class SomeCaseClass(name: String)

object CaseClassesAndPatternMatching extends App {

  def doesClassMatch(`class`: SomeCaseClass): String = {
    `class` match {
      case SomeCaseClass("hello") => "I found 'hello'"
      case SomeCaseClass("goodbye") => "I found 'goodbye'"
      case _ => "I didn't find much of anything!"
    }
  }

  println(doesClassMatch(SomeCaseClass("hello")))
  println(doesClassMatch(SomeCaseClass("goodbye")))
  println(doesClassMatch(SomeCaseClass("blah")))
}