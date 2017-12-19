package uk.robevans.assertions

object AssertMethods extends App {

  print("Enter your first integer: ")
  val one = scala.io.StdIn.readInt()
  print("Enter your second integer: ")
  val two = scala.io.StdIn.readInt()
  assert(one < two, s"$one is not greater than $two")

  /**
    * ensure takes the output of the if expression and compares it to something
    * to form a predicate. If the result is true, then the result of the if expression
    * is returned. If the predicate evaluates to false, then an AssertionException is thrown.
    * @param x
    * @param y
    * @return
    */
  def doSomeEnsureChecking(x: Int, y: Int): String = {
    val success = "success"
    val fail = "fail"
    var result = None
    if (x <= y) { success }
    else { fail } ensuring (_ == success)
  }

//  val read
  doSomeEnsureChecking(one, two)

}
