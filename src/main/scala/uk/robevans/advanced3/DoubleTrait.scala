package uk.robevans.advanced3

/**
  * A trait that extends another Class must only be used on objects that
  * are subclasses of the extended class. In this case DoubleTrait is a subclass
  * monadic type IntQueue[Int] so cannot be used with IntQueue[String] or IntQueue[Double]...
  * DoubleTrait can only be used with classes of type IntQueue[Int]
  *
  * DoubleTrait is mixed in *after* another class which provides the concrete definition.
  * They are dynamically bound.
  * These types of traits are known as Stackable Modifiers.
  * DoubleTrait becomes a subclasse of the class that utilises it.
  *
  */
trait DoubleTrait extends IntQueue[Int] {
  abstract override def put(x: Int) = { super.put(2 * x) }
}
