object zadanie7 {
//  Zaprezentuj działanie Option na dowolnym przykładzie (np. mapy, w której wyszukujemy wartości po kluczu)
  def main(args: Array[String]): Unit = {
    val capitals: Map[String, String] = Map("Mazowsze" -> "Warszawa", "Pomorskie" -> "Gdańsk")
    println(s"Stolicą Mazowsza jest ${capitals.get("Mazowsze")}")
    println(s"Stolicą Małopolski jest ${capitals.get("Małopolska")} czego nie ma w kolekcji")
    println(s"Stolicą Małopolski jest ${capitals.getOrElse("Małopolski", "Kraków")} czego nie ma w kolekcji, ale nic nie szkodzi bo mamy getOrElse ")
  }
}
