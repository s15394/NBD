object zadanie10 {
//  Stwórz funkcję przyjmującą listę liczb rzeczywistych i zwracającą stworzoną na jej podstawie listę zawierającą
//  wartości bezwzględne elementów z oryginalnej listy należących do przedziału <-5,12>. Wykorzystaj filtrowanie
  def main(args: Array[String]): Unit = {
    val list: List[Double] = List(1.0, -5.5, -5.0, -4.2, 10.123, 11.99, 12.2)
    println("Lista przed filtracją")
    println(list)
    println("Lista po filtracją")
    println(filterAndAbs(list))
  }

  def filterAndAbs(list: List[Double]): List[Double] = {
    list.filter(_ >= -5)
      .filter(_ <= 12)
      .map(_.abs)
  }
}
