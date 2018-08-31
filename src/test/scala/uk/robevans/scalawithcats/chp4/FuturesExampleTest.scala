package uk.robevans.scalawithcats.chp4

import org.scalatest.{FunSpec, Matchers}

class FuturesExampleTest extends FunSpec with Matchers {

  describe("Monadic Futures") {
    it("") {
      val futuresExample = new FuturesExample
      val result = futuresExample.doSomethingLongRunning()
      result should be (4)
    }
  }

}
