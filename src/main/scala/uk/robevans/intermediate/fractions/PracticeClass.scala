package uk.robevans.intermediate.fractions

/**
  * Class definition of a rational number - class name is more descriptive
  * of the concept I'm learning rather than the class
  * @param n
  * @param d
  */
class PracticeClass(n: Int, d: Int) {
  require(d!=0)
  val numerator :Int = n
  val denominator :Int = d

  // auxilliary constructor - def this(...)
  // here, 'this' refers to this object as this is a constructor.
  // typically 'this' would refer to the object instance.
  // Every constructor in scala, will eventually call the main constructor
  def this(n: Int) = this(n, 1)

  override def toString: String =
    if (denominator == 1) numerator + ""
    else (numerator + "/" + denominator)

  def `new` : String = "some new string variable defined using keyword new (in backticks)"

  def + (that :PracticeClass) : PracticeClass = new PracticeClass(
    numerator * that.denominator + that.numerator * denominator,
    denominator * that.denominator)

}

object PracticeClass extends App {
    // This is essentially an IMPLICIT CONVERTER
    // This will convert instances of int to instances of PracticeClass
    // This will enable us to carry out our add method on practice class instances
    // and convert integers into instances of practice class so we can
    // write 2.add(PracticeClass) or PracticeClass.add(2).
    // or 2 + PracticeClass or PracticeClass + 2
    // Apply implicit converters when they're needed (ie here in the companion class, not the object blueprint)
    implicit def intToPracticeClass(x: Int) = new PracticeClass(x)

    def oneHalf = new PracticeClass(1, 2)
    def twoThirds = new PracticeClass(2, 3)
    def one = new PracticeClass(1)
    def two = new PracticeClass(2)

    println(oneHalf)
    println(twoThirds)
    println(s"(1/2) + (2/3) = ${(oneHalf + twoThirds)}")

    // access to variables is public
    println(s"Numerator of oneHalf: ${oneHalf.numerator}")
    println(s"Denominator of oneHalf: ${oneHalf.denominator}")
    println(s"New : ${oneHalf.`new`}")

    println (s"2 + PracticeClass: ${(2 + two)}")
    println (s"PracticeClass + 2: ${(two + 2)}")
}