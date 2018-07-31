package uk.robevans.scalaredbook.chp2

class PartialFunction {

  /**
    * partial function takes an A and an F : A,B => C.
    * Returns a B => C
    * therefore since you already have the A, when calling partial1,
    * you get back a function that maps B => C.
    * So when you use the function, you just need to supply the B
    */
  def partial1[A,B,C](a: A, f: (A,B) => C) : B => C =
    (b: B) => f(a,b)

  // currying -> given an uncurried thing, return a curried one (f(a,b))
  def curry[A,B,C](f: (A,B) => C) : A => (B=>C) = { // equivalent to (A=>B=>C)
      a => b => f(a,b)
  }

  // uncurry -> given a curried function, return a function that is uncurried.
  def uncurry[A,B,C](f: A=>B=>C) : (A,B) => C = {
    (a,b) => f(a)(b)
  }

  def compose[A,B,C](f: B=>C, g: A=>B): A => C = {
    a => f(g(a))
  }
}
