object zadanie1 {

  def wholeAndDividerIt: Iterator[(Int, Int)] = for {
    a <- Iterator.from(1)
    b <- 1 until (a+1) if a % b == 0
  } yield (a,b)

  def main(args: Array[String]): Unit = {
    val divider = wholeAndDividerIt.buffered
    println(divider.next())
    println(divider.next())
    divider take 18 foreach(println)
  }
}
