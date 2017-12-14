package uk.robevans.advanced3

abstract class IntQueue[T] {
  def get() : T
  def put(x: T)
}
