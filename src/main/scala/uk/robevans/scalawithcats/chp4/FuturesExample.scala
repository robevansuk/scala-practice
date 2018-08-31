package uk.robevans.scalawithcats.chp4

import java.util.concurrent.Future

class FuturesExample {

  // Futures take an implicit execution context - this comes from
  // scala.concurrent.ExecutionContext.Implicits.global

  def doSomethingLongRunning(): Future[Int] = ???
  def doSomethingElseLongRunning(): Future[Int] = ???

  // here the operations are running in sequence
  def doSomethingReallyLongRunning(): Future[Int] = {
    for {
      result1 <- doSomethingLongRunning()
      result2 <- doSomethingElseLongRunning()
    } yield (result1 + result2)
  }

}
