object zadanie4 {
  def main(args: Array[String]): Unit = {
    val no = No()
    val yes = Yes(420)
    println(no.getOrElse(69))
    println(yes.getOrElse(69))
  }
}
