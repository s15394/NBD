import scala.annotation.tailrec

object zadanie8 {
//  Napisz funkcję usuwającą zera z listy wartości całkowitych
//  (tzn. zwracającą listę elementów mających wartości różne od 0). Wykorzystaj rekurencje
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, -4, 5, 0, -7, 0, 9, 0, -12)
    val listWithOutZero = omitZero(list, List())
    println("Lista przed usunięniem zer")
    println(list)
    println("Lista po usunięciu zer")
    println(listWithOutZero)
  }

  @tailrec
  def omitZero(list: List[Int], acc: List[Int]): List[Int] = list match {
    case x :: tail if x == 0 => omitZero(tail, acc)
    case x :: tail => omitZero(tail, acc.appended(x))
    case Nil => acc
  }
}
