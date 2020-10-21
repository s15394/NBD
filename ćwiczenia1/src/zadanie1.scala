import scala.io.StdIn

object zadanie1 {
  def main(args: Array[String]): Unit = {
    val week = new Week()
    println("Wybierz wariant wypisania dni tygodnia a,b lub c")
    val input = StdIn.readChar()
    input match {
      case 'a' => printWithFor(week.days)
      case 'b' => printWithForStartingWithP(week.days)
      case 'c' => printWithWhile(week.days)
      case default => println("Nie znam wariantu " + default)
    }
  }

  def printWithFor(list: List[String]): Unit = {
    if (list.isEmpty) return

    var reducedList: String = ""
    for (i <- list.indices) {
      reducedList = if (reducedList.isBlank) reducedList.concat(list(i)) else reducedList.concat(", " + list(i))
    }
    println(reducedList)
  }

  def printWithForStartingWithP(list: List[String]): Unit = {
    if (list.isEmpty) return
    var reducedList: String = ""
    for (item <- list if item.startsWith("P")) {
      reducedList =  if (reducedList.isBlank) reducedList.concat(item) else reducedList.concat(", " + item)
    }

    println(reducedList)
  }

  def printWithWhile(list: List[String]): Unit = {
    if (list.isEmpty) return;
    var i: Int = 0
    var reducedList: String = ""
    while (i < list.size) {
      reducedList =  if (reducedList.isBlank) reducedList.concat(list(i)) else reducedList.concat(", " + list(i))
      i += 1
    }
    println(reducedList)
  }
}
