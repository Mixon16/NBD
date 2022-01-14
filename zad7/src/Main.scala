import scala.annotation.tailrec
import scala.collection.convert.ImplicitConversions.`seq AsJavaList`
import scala.util.control.Breaks.{break, breakable}

object Main {
  def main(args: Array[String]) = {
    // 1. Stwórz 7 elementową listę zawierającą nazwy dni tygodnia. Napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    val daysOfTheWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    // a) Pętli for
    println("> 1 a)")
    zad1a(daysOfTheWeek)

    // b) Pętli for wypisując tylko dni z nazwami zaczynającymi się na „P”
    println("> 1 b)")
    println(zad1b(daysOfTheWeek))

    // c) Pętli while
    println("> 1 c)")
    println(zad1c(daysOfTheWeek))

    // 2. Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    // a) Funkcji rekurencyjnej
    println("> 2 a)")
    println(zad2a(daysOfTheWeek))
    // b) Funkcji rekurencyjnej wypisując elementy listy od końca
    println("> 2 b)")
    println(zad2b(daysOfTheWeek))

    // 3. Stwórz funkcję korzystającą z rekurencji ogonowej do zwrócenia oddzielonego przecinkami stringa zawierającego elementy listy z ćwiczenia 1
    println("> 3")
    println(zad3(daysOfTheWeek))

    // 4. Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    // a) Metody foldl
    println("> 4 a)")
    println(zad4a(daysOfTheWeek))

    // b) Metody foldr
    println("> 4 b)")
    println(zad4b(daysOfTheWeek))

    // c) Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”
    println("> 4 c)")
    println(zad4c(daysOfTheWeek))

    // 5) Stwórz mapę z nazwami produktów i cenami. Na jej podstawie wygeneruj drugą, z 10% obniżką cen. Wykorzystaj mechanizm mapowania kolekcji.
    println("> 5")
    val products = Map("Jajka" -> 2, "Chleb" -> 3, "Pomidory" -> 4)
    val productsSale = products map { case (key, value) => (key, value * 1.1) }
    println(productsSale)

    // 6) Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je
    println("> 6")
    zad6("abc", 3, daysOfTheWeek)

    // 7) Zaprezentuj działanie Option na dowolnym przykładzie (np. mapy, w której wyszukujemy wartości po kluczu)
    println("> 7")
    // Some(2)
    val pricePerEgg = products.get("Jajka")
    println(pricePerEgg)
    // None
    val pricePerButter = products.get("Maslo")
    println(pricePerButter)

    // 8) Napisz funkcję usuwającą zera z listy wartości całkowitych (tzn. zwracającą listę elementów mających wartości różne od 0).  Wykorzystaj rekurencję.
    println("> 8")
    val intList = List(1, 0, 3, -3, 0, 8, 0, 9, 1, 1, 0)
    println(zad9(intList))


    // 9) Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i zwracającą wygenerowaną na jej podstawie listę, w której wszystkie liczby zostały zwiększone o 1. Wykorzystaj mechanizm mapowania kolekcji.
    println("> 9")
    println(zad9(intList))
