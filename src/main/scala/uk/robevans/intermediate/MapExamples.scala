package uk.robevans.intermediate

import scala.collection.mutable

object MapExamples extends App {

  val romanNumerals = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
  )

  for (romanNumeral <- romanNumerals) {
      print(romanNumeral)
      print(", ")
  }
  println()
  println(romanNumerals(4))

  var anotherMap = mutable.Map(
    "A" -> "alpha",
    "B" -> "bravo",
    "C" -> "charlie",
    "D" -> "delta",
    "E" -> "echo",
    "F" -> "foxtrot",
    "G" -> "golf",
    "H" -> "hotel",
    "I" -> "india",
    "J" -> "juliette",
    "K" -> "kilo",
    "L" -> "lima",
    "M" -> "mike",
    "N" -> "november",
    "O" -> "oscar",
    "P" -> "papa",
    "Q" -> "quebec",
    "R" -> "romeo",
    "S" -> "sierra",
    "T" -> "tango",
    "U" -> "uniform",
    "V" -> "victor",
    "W" -> "whiskey",
    "X" -> "xray",
    "Y" -> "yankee",
    "Z" -> "zulu"
  )

  def printArgs(args: mutable.Map[String, String]): Unit = {
    args.foreach(println)
  }

  printArgs(anotherMap)

  anotherMap = mutable.Map(
    "1" -> "One",
    "2" -> "Two",
    "3" -> "Tree",
    "4" -> "Fow-er",
    "5" -> "Fife",
    "6" -> "Six",
    "7" -> "Seven",
    "8" -> "Ait",
    "9" -> "Niner",
    "0" -> "Zero"
  )

  printArgs(anotherMap)

  printArgs(anotherMap + ("10" -> "ten"))


}
