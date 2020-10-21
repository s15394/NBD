object zadanie3 {
//  Zdefiniuj klasę Osoba z własnościami imie i nazwisko. Stwórz kilka instancji tej klasy. Zdefiniuj funkcję,
//  która przyjmuje obiekt klasy osoba i przy pomocy Pattern Matching wybiera i zwraca napis
//  zawierający przywitanie danej osoby.
//  Zdefiniuj 2-3 różne przywitania dla konkretnych osób (z określonym imionami lub nazwiskami) oraz jedno domyślne
  def main(args: Array[String]): Unit = {
  val people = List(Osoba2("Jan", "Kowalski"), Osoba2("Jacek", "Malinowski"),
    Osoba2("Paweł", "Kowalski"), new Osoba2("Piotr", "Kichał"),
    Osoba2("Zbigniew", "Zero"))
  people.foreach(person => println(hello(person)))
  }

  def hello(person: Osoba2):String = person match {
    case Osoba2("Jacek",_) => s"Witaj Jacku posypany lukrem placku"
    case Osoba2("Paweł", _) => s"Witaj nam Pawle co palce przycinasz w imadle"
    case Osoba2(_, "Kichał") => s"Witaj ${person.imie} ${person.nazwisko} co bez przerwy prychał"
    case _ => s"Witaj ${person.imie} ${person.nazwisko}"
  }
}
