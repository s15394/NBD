import scala.io.StdIn

object zadanie2 {

  def printWithReccurance(list: List[String]): Unit = {
    def reccurent(list: List[String]): String = list match {
      case Nil => ""
      case x :: tail => {
        var s = reccurent(tail)
        s = if (s.isBlank) s else ", " + s
        x + s
      }
    }
    println(reccurent(list))
  }

  def printWithReccuranceReverse(list: List[String]): Unit = {
    def reccurentReverse(list: List[String]): String = list match {
      case Nil => ""
      case x => {
        var s = reccurentReverse(list.tail)
        s = if (s.isBlank) s else s + ", "
        s + list.head
      }
    }
    println(reccurentReverse(list))
  }

  def main(args: Array[String]): Unit = {
    val week = new Week
    println("Wybierz wariant wypisania dni tygodnia a lub b")
    val input = StdIn.readChar()
    input match {
      case 'a' => printWithReccurance(week.days)
      case 'b' => printWithReccuranceReverse(week.days)
      case default => println("Nie znam wariantu " + default)
    }
  }
}
