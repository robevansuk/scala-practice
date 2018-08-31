package uk.robevans.scalawithcats.chp4

import org.scalatest.{FunSpec, Matchers}

class CatsMonadsTest extends FunSpec with Matchers {

  describe("Pure Monad") {
    it ("Wraps a value in a Cats monad") {
      val optionCatsMonads = new OptionCatsMonads
      val result = optionCatsMonads.pure(22)
      result should be (Some(22))
    }
  }

}
