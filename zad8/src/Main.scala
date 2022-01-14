object Main {
  def main(args: Array[String]): Unit = {

    //Zadanie 1

    def weekDays(day: String): String = day match {
      case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => "Praca"
      case "Sobota" | "Niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia."
    }

    println("Zad 1)")
    println(weekDays("Poniedzialek"))
    println(weekDays("Wtorek"))
    println(weekDays("Sroda"))
    println(weekDays("Coscos"))
    println(weekDays("Meksyk"))

    //Zadanie 2

    class KontoBankowe {
      private var _stanKonta: Double = 0.0

      def this(stanKonta: Double) = {
        this()
        this._stanKonta = stanKonta
      }

      def wyswietlStanKonta = _stanKonta

      def wplata(wartosc: Double): Unit = {
        _stanKonta += wartosc
      }

      def wyplata(wartosc: Double): Unit = {
        if (_stanKonta >= wartosc) _stanKonta -= wartosc
        else println(s"Za mało pieniędzy na koncie. Nie można wykonać operacji wypłaty $wartosc.")
      }
    }
    val kontoPuste = new KontoBankowe
    val konto1 = new KontoBankowe(965)
    val konto2 = new KontoBankowe(1000)

    println("Zad 2)")
    println("Puste konto: " + kontoPuste.wyswietlStanKonta)
    println("Konto 1: " + konto1.wyswietlStanKonta)
    konto1.wplata(3)
    konto1.wyplata(2000)
    konto1.wyplata(120)
    println("Konto 2: " + konto2.wyswietlStanKonta)
    konto2.wyplata(450)
    println("Konto nr 1 po wykonanych operacjach: " + konto1.wyswietlStanKonta)
    println("Konto nr 2 po wykonanych operacjach: " + konto2.wyswietlStanKonta)

    //Zadanie 3

    case class Osoba(imie: String, nazwisko: String) {
    }

    def przywitanie(osoba: Osoba): String = {
      osoba match {
        case Osoba(imie, _) if imie.contains("Mateusz") => "Witam Cię Mateuszu!"
        case Osoba(imie, _) if imie.contains("Barbara") => "Witam Cię Barbaro!"
        case Osoba(imie, _) if imie.contains("Zuzanna") => "Witam Cię Zuzanno!"
        case _ => "Witam Cię użytkowniku!"
      }
    }

    val osoba1 = new Osoba("Barbara", "Koziol")
    val osoba2 = new Osoba("Mateusz", "Wajcha")
    val osoba3 = new Osoba("Eugeniusz", "Swistak")
    val osoba4 = new Osoba("Maurycy", "Polnik")
    val osoba5 = new Osoba("Zuzanna", "Kalor")

    println("Zad 3)")

    println(przywitanie(osoba1))
    println(przywitanie(osoba2))
    println(przywitanie(osoba3))
    println(przywitanie(osoba4))
    println(przywitanie(osoba5))


    //Zadanie 4

    def fx1(x: Int): Int = (x * 8) / 2

    def fx2(x: Int, fx1: Int => Int): Int = {
      var y = x
      y = fx1(y)
      y = fx1(y)
      fx1(y)
    }

    println("Zad 4)")

    println(fx2(4, fx1))
  }
}
