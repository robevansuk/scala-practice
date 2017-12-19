package uk.robevans.advanced3

import scala.collection.mutable.ArrayBuffer

/**
  * simple IntQueue Implementation
  */
class DefaultIntQueue extends IntQueue[Int] {
  private val buf = new ArrayBuffer[Int]
  def get() : Int = { buf.remove(0) }
  override def put(x: Int) = { buf.append(x) }
}