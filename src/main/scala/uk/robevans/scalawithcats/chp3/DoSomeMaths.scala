package uk.robevans.scalawithcats.chp3

import scala.language.higherKinds

class DoSomeMaths {

  def doMath[F[_]](start: F[Int])(implicit functor: Functor[F]): F[Int] = start.map(n => (n + 1) *  2)

  // This implicit class enables us to add/decorate a map method on to a
  implicit class FunctorOps[F[_], A](src: F[A]) {
    def map[B](func: A=>B)(implicit functor: Functor[F]):F[B] = functor.map(src)(func)
  }
}


