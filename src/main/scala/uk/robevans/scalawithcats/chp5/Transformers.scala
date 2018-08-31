package uk.robevans.scalawithcats.chp5

/**
  * Monad Transformers:
  * A number of transformers exist in Cats to transform
  * monadic composition into a single monad.
  * Examples
  * Monad[Either] ->> List[Either[ErrType, Int]], we could use EitherT[List, ErrType, Int]
  *                        ^^^^^^
  * Monad[Option] ->> Try[Option[Int]] we can use OptionT[Try, Int]
  *                       ^^^^^^
  *
  *
  */
class Transformers {

}
