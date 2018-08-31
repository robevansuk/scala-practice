package uk.robevans.scalawithcats.chp3

trait Printable[A] {

  def format(value: A): String
  def contramap[B](func: B=>A):Printable[B] = new Printable[B]{
    override def format(value: B): String = value.toString
  }

}
class SomethingPrintable[A] {

   def doFormatting(value: A)(implicit p: Printable[A]): String = p.format(value)

}
