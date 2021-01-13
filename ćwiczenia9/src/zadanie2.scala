object zadanie2 {
  def main(args: Array[String]): Unit = {
    val no = No()
    val yes = Yes()
    println(no.isInstanceOf[Maybe[_]])
    println(yes.isInstanceOf[Maybe[_]])
  }
}
