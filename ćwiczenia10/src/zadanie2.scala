object zadanie2 {

  def addRandomToInt(a: Int) = (a + (math.random() * 10)).intValue()
  def parseIntAsMaybeYes(a: Int): Maybe[Int] = Yes(a+1)


  def main(args: Array[String]): Unit = {

    val no = No()
    val yes = Yes(420)
    println(no.map(addRandomToInt))
    println(yes.map(addRandomToInt))
    println(yes.flatMap(parseIntAsMaybeYes))
  }
}
