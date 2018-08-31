package uk.robevans.scalawithcats.chp4

import scala.language.higherKinds

// this trait needs implementing before we can use it. It just defines the interface
trait CatsMonads[F[_]] {

  // This will take an A and wrap it up in an F
  def pure[A](value: A): F[A]

  // This will take an F[A] a function for re-wrapping the value A (inside context F)
  // to an F[B], then wrap the overall result up as an F[B]
  def flatMap[A, B](input: F[A])(functor: A=>F[B]): F[B]
}

class OptionCatsMonads extends CatsMonads[Option] {
  override def pure[A](value: A): Option[A] = Option.apply(value)

  override def flatMap[A, B](input:Option[A])(functor: A => Option[B]): Option[B] = {
    input.flatMap(functor(_))
  }
}