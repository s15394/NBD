
import scala.io.StdIn

object zadanie4 {

  def printWithFold(list: List[String]): Unit = {
   val result =  list.foldLeft("") {(acc: String, ele: String) => if (acc.isBlank) acc.concat(ele) else acc.concat(", ").concat(ele)}
    println(result)
  }

  def printwithFoldr(list: List[String]): Unit = {
    val result =  list.foldRight("") {(ele: String, acc: String) => if (acc.isBlank) acc.concat(ele) else acc.concat(", ").concat(ele)}
    println(result)
  }

  def printWithFoldlStartingWithP(list: List[String]): Unit = {
    val result =  list.foldLeft("") {(acc: String, ele: String) => {
      if (ele.startsWith("P")) {
        if (acc.isBlank) acc.concat(ele) else acc.concat(", ").concat(ele)
      }
      else acc
    }}
    println(result)
  }

  def main(args: Array[String]): Unit = {
    val week = new Week()
    println("Wybierz wariant wypisania dni tygodnia a,b lub c")
    val input = StdIn.readChar()
    input match {
      case 'a' => printWithFold(week.days)
      case 'b' => printwithFoldr(week.days)
      case 'c' => printWithFoldlStartingWithP(week.days)
      case default => println("Nie znam wariantu " + default)
    }
  }
}
