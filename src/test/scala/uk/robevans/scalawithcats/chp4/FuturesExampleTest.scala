package uk.robevans.scalawithcats.chp4

import org.scalatest.concurrent.Eventually
import org.scalatest.{FunSpec, Matchers}

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.util.Success

class FuturesExampleTest extends FunSpec with Matchers with Eventually {

  describe("Monadic Futures") {
    it("monads enable sequencing of computations") {
      val futuresExample = new FuturesExample
      val result = futuresExample.doSomethingReallyLongRunning()

      Await.ready(result, Duration.create("5seconds")).value.get should be (Success(4))

    }
  }

}
