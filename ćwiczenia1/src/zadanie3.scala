import scala.annotation.tailrec

object zadanie3 {
    def printWithReccurance(list: List[String]): Unit = {
      @tailrec
      def tailReccurent(list: List[String], result: String): String = list match {
        case Nil => result
        case x :: tail => if (result.isBlank) tailReccurent(tail, result + x) else tailReccurent(tail, result + ", " + x)
      }
      println(tailReccurent(list, ""))
    }

    def main(args: Array[String]): Unit = {
      val week = new Week
      println("Z rekurencją ogonową")
      printWithReccurance(week.days)
    }

}
