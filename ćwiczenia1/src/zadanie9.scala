object zadanie9 {
//  Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i zwracającą wygenerowaną na jej podstawie listę,
//  w której wszystkie liczby zostały zwiększone o 1. Wykorzystaj mechanizm mapowania kolekcji
  def main(args: Array[String]): Unit = {
      val list: List[Int] = List(1, 2, 3, 4, -5, -6, -7, -8, 9, -10)
      println("Lista przed dodaniem 1")
      println(list)
      println("Lista po dodaniu 1")
      println(addOne(list))
  }

  def addOne(list: List[Int]):List[Int] = {
    list.map(_ + 1)
  }
}
