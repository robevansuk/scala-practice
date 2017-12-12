package uk.robevans.advanced

class ParameterExamples {

  // Named param out: and a default = Console.out
  def printTime(out: java.io.PrintStream = Console.out) =
    out.println("time = " + System.currentTimeMillis())

  def isGoodEnough(guess: Double): Boolean = {
    if (guess < 1) true
    else false
  }

  def improve(guess: Double): Double = {
    guess - 1
  }

  // tail recursion avoids vars, is more compact and as efficient/fast as a while loop so is preferable.
  // The Scala compiler detects tail recursion and replaces it with a jump back to the beginning of the function
  def estimate(guess: Double):Double = {
    if (isGoodEnough(guess)) guess
    else improve(guess)
  }

  // Example of how to lazily evaluate some argument supplied as a parameter.
  def assertSomething(predicate: => Boolean) = {
    if (false && !predicate) {
      throw new IllegalArgumentException
    }
  }

  // Non-lazy evaluation of somethingElse (will blow up regardless because predicate will be eagerly evaluated)
  def assertSomethingElse(predicate: Boolean) = {
    if (false && !predicate) {
      throw new IllegalArgumentException
    }
  }

  /**
    * Uncomment the below to run this example
    */
//  assertSomething(5>3) // not evaluated until !predicate is called on
//  assertSomethingElse(5>3) // evaluated before method is called



}
