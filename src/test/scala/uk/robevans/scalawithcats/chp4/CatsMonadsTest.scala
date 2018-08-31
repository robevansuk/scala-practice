package uk.robevans.scalawithcats.chp4

import cats.Monad
import cats.instances.future._
import cats.instances.option._
import org.scalatest.{FunSpec, Matchers}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

class CatsMonadsTest extends FunSpec with Matchers {

  describe("OptionCatsMonad") {
    it ("Wraps a value in a Cats monad for pure function") {
      val optionCatsMonads = new OptionCatsMonads
      val result = optionCatsMonads.pure(22)
      result should be (Some(22))
    }

    it("flatMaps over the OptionCatsMonad") {
      val optionCatsMonads = new OptionCatsMonads
      val input = Option(22)
      val result = optionCatsMonads.flatMap[Int, String](input)(i => Some(s"$i!!!"))
      result should be (Option("22!!!"))
    }
  }

  describe("Cats Monad") {
    it("Monad[Option].pure") {
      val optionMonad = Monad[Option].pure(22)
      optionMonad should be (Some(22))
    }
    it("Monad[Option].flatMap") {
      val optionMonad = Monad[Option].pure(25)
      optionMonad.flatMap[String](i => Some(s"${i}TTT")) should be (Some("25TTT"))
    }
  }

  describe("Cats Future Monad") {
    it("works with standard implicit, global ExecutionContext") {
      val futureMonad = Monad[Future]
      val future = futureMonad.flatMap(futureMonad.pure(300))(_ => Future("1"))
      Await.result(future, 1.second) should be ("1")
    }
  }

}
