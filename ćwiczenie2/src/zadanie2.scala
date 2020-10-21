object zadanie2 {
//  Zdefiniuj klasę KontoBankowe z metodami wplata i wyplata oraz własnością stanKonta - własność ma być tylko do odczytu.
//  Klasa powinna udostępniać konstruktor przyjmujący początkowy stan konta oraz drugi,
//  ustawiający początkowy stan konta na 0
  def main(args: Array[String]): Unit = {
    val kontoBankowe = new KontoBankowe()
    println(s"Początkowy stan konta ${kontoBankowe.stanKonta}")
    kontoBankowe.wplata(200)
    println(s"Po wpłacie 200 saldo wynosi ${kontoBankowe.stanKonta}")
    kontoBankowe.wyplata(100.10)
    println(s"Po wyplacie 100.10 saldo wynosi ${kontoBankowe.stanKonta}")
    val konto2 = new KontoBankowe(200)
    println(s"Drugie konto bankowe posiada saldo początkowe równe ${konto2.stanKonta}")
  }
}
