object zadanie6 {
//  Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je
  def main(args: Array[String]): Unit = {
    val tuple = Tuple3(69, "420", 21.37)
    printTuple(tuple)
  }

  def printTuple(tuple3: (Any, Any, Any)): Unit = {
    tuple3.productIterator
      .foreach(println)
  }
}
