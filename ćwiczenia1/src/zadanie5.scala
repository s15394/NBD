object zadanie5 {
  def main(args: Array[String]): Unit = {
    val productsMap: Map[String, Double] = Map("pen" -> 3.0, "paper" -> 5.5, "water" -> 1.5, "vodka" -> 25.99)
    println("Początkowe ceny")
    println(productsMap)
    println("Po obniżce")
//    var mappedMap = productsMap map { case (name: String, price: Double) => (name, price * 0.9) }
    val mappedMap = productsMap.map(entry  => entry._1 -> entry._2 * 0.9)
//    mappedMap = productsMap.map(entry  => discount(entry._1, entry._2))

    println(mappedMap)
  }

  def discount(name: String, price: Double): (String,Double) = {
    (name, price * 0.9)
  }
}
