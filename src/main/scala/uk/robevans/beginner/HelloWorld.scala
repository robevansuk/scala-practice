package uk.robevans.beginner

object HelloWorld extends App {

  val helloWorld = "Hello World, for a second time!"
  val goodbye = "Goodbye, cruel world!"

  def getHelloWorld() = {
    "Hello World!"
  }

  def printHelloWorld() = println("Hello world as a function")

  def goodbye(msg  : String) = { println(msg) }

  println(getHelloWorld())
  println(helloWorld)
  printHelloWorld()
  goodbye(goodbye)

}
