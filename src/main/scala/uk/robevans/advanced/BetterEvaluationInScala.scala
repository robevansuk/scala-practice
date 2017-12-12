package uk.robevans.advanced

class BetterEvaluationInScala {

  def main (args : Array[String]) = {
    /**
      * the following code segment relies on a variable, making the code harder to read since
      * now you have to scan every line that follows to ensure there are no other
      * updates to the value in order to be able to rely on it
      */

    // non-functional way to determine a value - starting with a variable
    var filename = "default.txt" // <-- var not val.
    if (!args.isEmpty)
      filename = args(0)

    println(s"Filename 1: $filename")


    /**
      * using a val is easier to read as the reader will know the value doesn't change once it's set
      * so it's clearer to anyone reading your code
      * Another advantage is it is easier to reason about from the beginning. We know what value
      * it will take and what value(s) we need to handle afterwards.
      */

    val filename_2 =
      if(!args.isEmpty) args(0)
      else "default.txt"

    println(s"Filename 2: $filename_2")

    /**
      * Vals also support equational reasoning. A val is equal to the equation that produced it, so long
      * as there are no side effects.
      */
    println(if (!args.isEmpty) args(0) else "default.txt")

  }
}

