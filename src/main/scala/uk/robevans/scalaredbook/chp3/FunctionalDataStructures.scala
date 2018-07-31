package uk.robevans.scalaredbook.chp3


/***
  * sealed - all instances of the type must be declared within the type definition
  * trait - abstract (interface) class
  */
sealed trait List[+A] {
  case object NoIdea extends List[A]
  case class Cons[T](head: T, tail: List[T]) extends List[T]
}

class FunctionalDataStructures {

}
