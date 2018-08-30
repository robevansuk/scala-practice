package uk.robevans.scalawithcats

import org.scalatest.{FunSpec, Matchers}

class OptionFunctorTest extends FunSpec with Matchers {

  describe("Functor should allow mapping using A => B to get an Some[B]") {
    it ("Should work for Int => Int") {
      val intFunctor = new OptionFunctor()
      val result = intFunctor.map[Int, Int](Option(1))(x => x + 1)

      result should be (Some(2))
    }

    it ("Should work for Int => String") {
      val intFunctor = new OptionFunctor()
      val result = intFunctor.map[Int, String](Option(1))(x => x + "!!!")

      result should be (Some("1!!!"))
    }
  }

  describe("Abstracting over Functors"){

    // the function DoSomeMaths.doMath takes an implicit Functor
    // therefore we must declare a Functor in the implicit scope
    implicit val implicitOptionFunctor = new OptionFunctor()
    val maths = new DoSomeMaths

    it("do math for Options"){
      val result = maths.doMath(Option(19))
      result should be (Some(40))
    }

    implicit val implicitListFunctor = new ListFunctor
    // Committing a failing test that requires the functor for Lists
    it("do math for Lists") {
      val result = maths.doMath(List(9, 19, 29))
      result should be (List(20, 40, 60))
    }
  }

}

class ListFunctor extends Functor[List] {
  override def map[A, B](fa: List[A])(f: A => B): List[B] = fa.map(f)
}
