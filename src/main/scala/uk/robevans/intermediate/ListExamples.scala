package uk.robevans.intermediate

object ListExamples extends App{

  val someList = List("one", "two", "three")
  val anotherList = List("four", "five")
  val concattedLists = someList ::: anotherList // List(one, two, three, four, five)

  println("someList " + someList)
  println("anotherList " + anotherList)
  println("concatenation " + concattedLists)


  val prependElementToList = "zero" :: someList :: anotherList // List(zero, List(one, two, three), four, five)
  println("Zero to five " + prependElementToList)

  val emptyList = Nil
  println("Empty " + emptyList) // List()

  val appendedToList = someList :+ "four"
  println("Appending " + appendedToList) // List(one, two, three, four)

  val numericList = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
  println("Drop first 2 elements: " + numericList.drop(2))
  println("Drop last 2 elements: " + numericList.dropRight(2))
  println("Anything greater than 4: " + numericList.filter(s => s > 4))
  println("Head " + numericList.head)
  println("All but the last " + numericList.init)
  println("is empty " + numericList.isEmpty)
  println("last " + numericList.last)
  println("length " + numericList.length)
  println("mapping " + numericList.map(s => s * 2))
  println("mkString " + numericList.mkString(", "))
  println("filterNot >10 " + numericList.filterNot(s => s >= 10))
  println("reverse " + numericList.reverse)
  println("tail " + numericList.tail)
}
