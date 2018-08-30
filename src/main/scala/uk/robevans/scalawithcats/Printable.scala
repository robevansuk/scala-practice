package uk.robevans.scalawithcats

trait Printable[A] {

  def format(value: A): String
  def contramap[B](func: B=>A):Printable[B] = new Printable[B]{
    override def format(value: B): String = {
      s"$value"
    }
  }

}
class SomethingPrintable[A] {

   def doFormatting(value: A)(implicit p: Printable[A]): String = p.format(value)

}
