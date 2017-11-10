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

  override def toString: String = numerator + "/" + denominator

  def add(that :PracticeClass) : PracticeClass = new PracticeClass(
    numerator * that.denominator + that.numerator * denominator,
    denominator * that.denominator)

}

object PracticeClass extends App {

    def oneHalf = new PracticeClass(1, 2)
    def twoThirds = new PracticeClass(2, 3)

    println(oneHalf)
    println(twoThirds)
    println("(1/2) + (2/3) = " + (oneHalf add twoThirds))
    println(s"Numerator of oneHalf: ${oneHalf.numerator}") // access to variables is public
    println(s"Denominator of oneHalf: ${oneHalf.denominator}")
}