package uk.robevans.intermediate.types

import scala.collection.mutable


/**
  * this is a scala object
  * Objects in Scala are Singletons - only one instance ever exists.
  * There will only ever be one instance of this available.
  * When an object shares the same name as a Class, the object is
  * known as the companion object.
  * Both the class and object must be in the same source file.
  * A companion class and companion object can access each others private members.
  * Singleton objects cannot be passed parameters on construction
  * Singleton objects are referenced by their class name. ScalaObject.methodName
  *
  */
object ScalaObject {

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ScalaObject
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

class ScalaObject {
  private var sum = 0
  def add(b: Byte): Unit = { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}
