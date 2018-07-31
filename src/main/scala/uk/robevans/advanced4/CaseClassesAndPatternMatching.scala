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
case class Addition(x: Int, y: Int)

object CaseClassesAndPatternMatching extends App {

  def doesClassMatch(`class`: SomeCaseClass): String = {
    `class` match {
      case SomeCaseClass("hello") => s"I found '${`class`.name}'"
      case SomeCaseClass("goodbye") => "I found 'goodbye'"
      case _ => "I didn't find much of anything!"
    }
  }

  println(doesClassMatch(SomeCaseClass("hello")))
  println(doesClassMatch(SomeCaseClass("goodbye")))
  println(doesClassMatch(SomeCaseClass("blah")))

  def typeMatcher(`class`: Any) = {
    `class` match {
      case s: SomeCaseClass => println(s"found SomeCaseClass. name: '$s'")
      case someString: String => println(s"found a String: '$someString'")
      case _ => println(s"Error: -1")
    }
  }

  typeMatcher(SomeCaseClass("I'm a case Class"))
  typeMatcher("I am a STRING")
  typeMatcher(5)

  def patternMatchAssignment(`class`: Any) = {
    `class` match {
      case SomeCaseClass(e @ _) => println(e) // assign whatever positional param is passed to e (using @)
      case _ => println("Unknown")

    }
  }

  patternMatchAssignment(SomeCaseClass("SomeClass"))
  patternMatchAssignment("-1")

  // pattern guards - perform checks on a pattern match so we can check variables are the same e.g.
  def patternMatchWhenVariablesAreSameValue(x: Int, y: Int): Unit = {
    Addition(x, y) match {
      case Addition(i, j) if i == j => multiply(i, 2) // here if i==j is the guard.
      case _ => add(x, y)
    }
  }

  def add(x: Int, y: Int): Unit = {
    x + y
  }

  def multiply(x: Int, y: Int) = {
    x * y
  }

  def capitalsMap = Map("France" -> "Paris", "Spain" -> "Madrid", "USA" -> "Washington")

  for ((country, city) <- capitalsMap) {
    println("The capital of " + country + " is " + city)
  }

  val opGroups = Array(Set("a", "b"), Set("c", "d"), Set("e", "f"))
  val assocs = for {
    i <- 0 until opGroups.length // generates an index for every entry of opGroups
    opGroup <- opGroups(i) // generator for every operator in opGroups
  } yield opGroup -> i // creates a new map of opgroup -> int
  assocs.toMap
}