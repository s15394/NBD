object zadanie1 {
//  Wykorzystaj Pattern Matching w funkcji przyjmującej parametr typu String. Dla stringów odpowiadających nazwom dni
//  tygodnia funkcja ma zwrócić „Praca” i „Weekend” (odpowiednio dla dni roboczych i wolnych), dla pozostałych
//  napisów „Nie ma takiego dnia”.
  def main(args: Array[String]): Unit = {
    val days = "Test" :: new Week().days
    days.foreach(day => println(s"Opis dla dnia ${day} to ${printDayDescription(day)}"))
  }


  def printDayDescription(day: String): String = day match {
    case "Poniedziałek" | "Wtorek" | "Środa" | "Czwartek" | "Piątek" => "Praca"
    case "Sobota" | "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}
