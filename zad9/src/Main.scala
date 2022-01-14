import scala.runtime.Nothing$
import scala.util.Try

object rozwiazanie {

  def main(args: Array[String]): Unit = {

    val conttainer1 = new Container(125)
    println("Type of " +conteiner1.getContent + " = " + conteiner1.applyFunction(conteiner1.getContent))

    val conteiner2 = new Container("Dobry przedmiot")
    println("Type of " +conteiner2.getContent + " = " + conteiner2.applyFunction(conteiner2.getContent))

    val conteiner3 = new Container(1.68)
    println("Type of " +conteiner3.getContent + " = " + conteiner3.applyFunction(conteiner3.getContent))


    val no = new No
    val yes = new Yes("seriously")

    println("No jest to pewna instancja Maybe: " + no.isInstanceOf[Maybe[_]])
    println("Yes jest to pewna instancja Maybe: " + yes.isInstanceOf[Maybe[String]])


    println(no.ApplyFunction())
    println(yes.ApplyFunction("seriously"))


    val nope: getOrElse[No[_]] = new getOrElse[No[_]](new No)
    println(nope.getOrElse)
    val yep: getOrElse[Yes[String]] = new getOrElse[Yes[String]](new Yes("Yup, that's a yes"))
    println(yep.getOrElse)
  }
}

class Container[A](private val value : A) {
  private val _value: A = value

  def getContent: A = _value

  def applyFunction(value:A) : Unit = println(plusOne(value))

  private def plusOne(a: A): String = (a.toString + " plus one!")
}

trait Maybe[A] {
  def ApplyFunction[A](a : A*): String
}

class No[A] extends Maybe[Nothing] {
  override def ApplyFunction[A](a : A*): String = {
    if (a.isEmpty) "No"
    else "Yes, " + a + " " + a.getClass
    }
}

class Yes[A](val value: A) extends Maybe[A] {
  val _value: A = value

  override def ApplyFunction[A](a : A*): String = {
    if (a.isEmpty) "No"
    else "Yes, " + a + " " + a.getClass
  }
}

class getOrElse[A](value: A) {
  val _value: A = value
  def getOrElse[B]: B =
    _value match {
      case _: Yes[_] => _value.asInstanceOf[Yes[A]]._value.asInstanceOf[B]
      case _: No[A] => "Nothing to see here".asInstanceOf[B]
    }
}
