package uk.robevans.advanced2

class NineDataTypes {

  val by: Byte = 1
  val sh: Short = 1
  val ch: Char = 'a'
  val in: Int = 1
  val lo: Long = 1l
  val fl: Float = 0.1f
  val d: Double = 0.1d
  val bo: Boolean = true
  val un: Unit = None

  val arrExc = 1 until 5
  val arrInc = 1 to 5
  val maximum = 42 max 44
  val minimum = 42 min 44
  val absoluteValueNeg  = (-12).abs
  val absoluteValuePos  = 12.abs

  maximum == minimum // false
  absoluteValueNeg == absoluteValuePos // true

  val x = "abcd".substring(2)
  val y = "abcd".substring(2)
  x == y // true
  x eq y // true
  x ne y // false - not equal to

  val xHash = x



  // using typed parameters avoids errors as they can be picked up during compile time rather than
  // later during run time.

  // all classes inherit from either AnyVal or AnyRef. Val classes (the datatypes above) all inherit from
}
