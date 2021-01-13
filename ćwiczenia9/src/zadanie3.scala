object zadanie3 {

  def addRandomToInt(a: Int) = (a + (math.random() * 10)).intValue()
  def main(args: Array[String]): Unit = {
    val no = No()
    val yes = Yes(420)
    val appliedNo = no.applyFunction(addRandomToInt)
    val appliedYes = yes.applyFunction(addRandomToInt)

    println(appliedNo)
    println(appliedYes)
  }
}
