package uk.robevans.advanced3


object QueueExample {
  def main(args: Array[String]) = {
    val myQueue = new DefaultIntQueue
    myQueue.put(10)
    myQueue.put(20)
    println(myQueue.get())
    println(myQueue.get())
  }
}
