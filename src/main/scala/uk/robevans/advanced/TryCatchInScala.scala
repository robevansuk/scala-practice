package uk.robevans.advanced

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

object TryCatchInScala extends App {

  try {
    // Use the file here
    val f = new FileReader("input.txt")
  } catch {
    case e : FileNotFoundException => println("1. File Not Found")
    case e : IOException => println("2. File no longer there!")
  }

  /**
    * try reading a file but always close it after you're done with it
    * so that system resources can be relinquished.
    */
  try {
    val file = new FileReader("someNonExistentFile.txt")
    try {
      file.read()
    } finally {
      // Try to only use finally to cause a side effect such as closing a file
      // Do not try to use it for return values as this is confusing
      // since there are varying effects depending on whether you explicitly return
      // vs. just relying on the last statement executed being the return type.
      file.close()
    }
  } catch {
    case e: FileNotFoundException => println("2. File Not Found")
    case e: IOException => println("2. File no longer there!")
  }

  /**
    * yielding a value from a function
    * @param path
    * @return
    */
  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        new URL("http://www.scala-lang.org")
    }

  println(urlFor("http://www.google.com")) // will yield the URL defined
  println(urlFor("htp://www.google.com")) // will yield the error case URL
}
