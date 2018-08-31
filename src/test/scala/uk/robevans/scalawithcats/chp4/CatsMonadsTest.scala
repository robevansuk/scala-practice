package uk.robevans.scalawithcats.chp4

import org.scalatest.{FunSpec, Matchers}

class CatsMonadsTest extends FunSpec with Matchers {

  describe("OptionCatsMonad") {
    it ("Wraps a value in a Cats monad for pure function") {
      val optionCatsMonads = new OptionCatsMonads
      val result = optionCatsMonads.pure(22)
      result should be (Some(22))
    }

    it("flatMaps over the OptionCatsMonad") {
      val optionCatsMonads = new OptionCatsMonads
      val input = Option(22)
      val result = optionCatsMonads.flatMap[Int, String](input)(i => Some(s"$i!!!"))
      result should be (Option("22!!!"))
    }
  }

}
