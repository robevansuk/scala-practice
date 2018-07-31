package uk.robevans.intermediate

import org.scalatest.{FlatSpec, Matchers}

class TuplesTestFlatSpec extends FlatSpec with Matchers {

  "A test" should "perform A" in {
    true should be (true)
  }

  "A test" must "perform A" in {
    true should be (true)
  }

  "A test" can "perform A" in {
    Array[Boolean](true) should contain (true)
  }

  "A map" must "map A to B" in {
    val aMap = Map("A" -> "B", "C" -> "D")
    aMap.get("A") should be ("B")
  }
}
