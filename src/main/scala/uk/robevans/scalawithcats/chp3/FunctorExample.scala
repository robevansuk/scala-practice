package uk.robevans.scalawithcats.chp3

import scala.language.higherKinds

/**
  * functors enable mapping F[_].map()
  * and Lifting Given A => B, we can get F[a] => F[B]
  *
  * Here: F[_] just tells us that Functor accepts a container type.
  */
trait Functor[F[_]] {
  def map[A, B](fa: F[A])(f: A => B): F[B]
}

// when a type constructor takes more than 1 type, it falls into the category
// of higher-kinded types.

// List // this is a type constructor - it takes one type parameter
// List[A] // List of some A is a type

// Close analogy exists for functions and values. Functions are Value constructors
// Functions take a value to construct some new value,
// this is just like type constructors take a type to construct some new type

// math.abs // function (aka value constructor) - takes a value
// math.abs(value) // value - produced using the value parameter

// In scala, to declare type constructors we use underscores. e.g.
// List[_]
// Option[_]
// Future[_]
// We can abstract higher using
// F[_] <- this represents all type constructors taking one type.
// Its no different to specifying a function's arguments. e.g.
//
//val f = (x: Int) => x + 2
//val f2 = f.map(f)

class OptionFunctor extends Functor[Option] {
  override def map[A, B](functorOfA: Option[A])(f: A => B): Option[B] = {
    functorOfA.map(f)
  }
}

