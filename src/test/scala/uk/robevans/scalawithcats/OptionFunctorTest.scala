package uk.robevans.scalawithcats

import org.scalatest.{FunSpec, Matchers}

class OptionFunctorTest extends FunSpec with Matchers {

  describe("Functor should allow mapping using A => B to get an Some[B]") {
    it ("Should work for Int => Int") {
      val intFunctor = new OptionFunctor()
      val result = intFunctor.map[Int, Int](Option(1))(x => x + 1)

      result should be (Some(2))
    }

    it ("Should work for Int => String") {
      val intFunctor = new OptionFunctor()
      val result = intFunctor.map[Int, String](Option(1))(x => x + "!!!")

      result should be (Some("1!!!"))
    }
  }

}
