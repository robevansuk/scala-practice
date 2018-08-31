package uk.robevans.scalawithcats.chp4

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class FuturesExample {

  // Futures take an implicit execution context - this comes from
  // scala.concurrent.ExecutionContext.Implicits.global

  def doSomethingLongRunning(): Future[Int] = Future(3)
  def doSomethingElseLongRunning(): Future[Int] = Future(1)

  // here the operations are running in sequence
  // this is not so great as we're reduced to running
  // computations, only when the previous one is complete.
  // This is so because of Monadic composition.
  def doSomethingReallyLongRunning(): Future[Int] = {
    for {
      result1 <- doSomethingLongRunning()
      result2 <- doSomethingElseLongRunning()
    } yield (result1 + result2)
  }

}
