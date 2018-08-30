package uk.robevans.scalawithcats

import org.scalatest.{FunSpec, Matchers}

class SomethingPrintableTest extends FunSpec with Matchers {

  describe("SomethingPrintable"){
    it("should format our printable correctly") {

      implicit val printable: Printable[String] = new Printable[String]() {
        override def format(value: String): String = {
          value
        }
      }
      val printableSomething = new SomethingPrintable[String]
      val result = printableSomething.doFormatting("something")
      result should be ("\"something\"")
    }

    it("should format printable booleans as yes/no") {
      implicit val printable: Printable[Boolean] = new Printable[Boolean]() {
        override def format(value: Boolean): String = {
          if (value) "yes" else "no"
        }
      }
      val printableBoolean = new SomethingPrintable[Boolean]
      val positiveResult = printableBoolean.doFormatting(true)
      val negativeResult = printableBoolean.doFormatting(false)
      positiveResult should be ("yes")
      negativeResult should be ("no")
    }
  }

}
