object zadanie1 {

  def parseDoubleAsIntList(a: Double) = List(a.toInt, ((a - a.toInt) * 100).toInt)

  def main(args: Array[String]): Unit = {
    val container = Container(4.20)
    println(container.getContent)
    val changedContainer = container.applyFunction(parseDoubleAsIntList)
    println(changedContainer.getContent)
  }
}
