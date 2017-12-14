package uk.robevans.advanced3

import scala.collection.mutable.ArrayBuffer

/**
  * simple IntQueue Implementation
  */
class DefaultIntQueue extends IntQueue[Int] {
  private def buf : ArrayBuffer[Int] = new ArrayBuffer[Int]
  override def get(): Int = buf.remove(0)
  override def put(x: Int) = buf.append(x)
}

object DefaultIntQueue {
  def main(args: Array[String]) = {
    def myQueue = new DefaultIntQueue
    myQueue.put(10)
    myQueue.put(20)
    println(myQueue.get())
    println(myQueue.get())
  }
}