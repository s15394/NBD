object zadanie4 {
//  Zdefiniuj funkcję przyjmującą dwa parametry - wartość całkowitą i funkcję operującą na wartości całkowitej.
//  Zastosuj przekazaną jako parametr funkcję trzykrotnie do wartości całkowitej i zwróć wynik.
  def main(args: Array[String]): Unit = {
  val num = 2;
  println(s"Wartość początkowa ${num}")
  println(s"Wartość po trzykrotnym zastosowaniu funkcji ${applyTriple(num, (n) => n*n)}")
  }

  def applyTriple(num: Int, function: Int => Int): Int = {

    List(function, function, function).foldLeft(num)( (num, function) => function(num) )
  }
}
