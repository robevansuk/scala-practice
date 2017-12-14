package uk.robevans.advanced2

class Subclass1(name_value: String) extends BaseClass1(name_value) {


  // overriding a method name with a value is a trait of Scala only because methods/fields share the same namespace
  // note: name in the BaseClass1 is a "def" parameterless method, but here it has been overridden with a field value.
  override val name : String = name_value

  override def demo() = {
    println(s"${this.getClass} demo: ${name}")
  }

}
