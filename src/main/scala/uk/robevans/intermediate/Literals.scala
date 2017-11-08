package uk.robevans.intermediate

object Literals extends App {

  // Raw String with strip margin
  println("""|Welcome to Scala Programming for Beginners.
             |Type "HELP" for help. (....Not Really)""".stripMargin)

  val doubleNumber = 1.234e5d
  val intNumber = 210938
  val floatNumber = 23.312f
  val littleNum : Short = 124
  val veryLittleNum : Byte = 12

  val someSymbol = 'someSymbol
  val nameOfSymbol = someSymbol.name

  val someBoolean = true
  val someFalse = false


  printTypeOfObject(doubleNumber)
  printTypeOfObject(intNumber)
  printTypeOfObject(floatNumber)
  printTypeOfObject(littleNum)
  printTypeOfObject(veryLittleNum)
  printTypeOfObject(someSymbol)
  printTypeOfObject(nameOfSymbol)
  printTypeOfObject(someBoolean)
  printTypeOfObject(someFalse)


  def printTypeOfObject( value : Any ) = {
    println (value + " : " + value.getClass)
  }

  println(s"The type of $someSymbol : ${someSymbol.getClass}")
  println(raw"print this raw\\\\string without escaping backslashes")
  println(f"pring some formatted numbers ${floatNumber}%.10f")

}
