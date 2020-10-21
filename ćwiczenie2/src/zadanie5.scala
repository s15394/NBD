object zadanie5 {
//  Zdefiniuj klasę Osoba i trzy traity: Student, Nauczyciel, Pracownik. Osoba powinna mieć własności read only:
//  imie, nazwisko, podatek. Pracownik powinien mieć własność pensja (z getterem i seterem).
//  Student i Pracownik powinni przesłaniać własność podatek – dla Studenta zwracamy 0, dla Pracownika 20% pensji.
//  Nauczyciel powinien dziedziczyć z Pracownika, dla niego podatek zwraca 10% pensji. Stwórz obiekty z każdym z traitów,
//  pokaż jak podatek działa dla każdego z nich. Stwórz obiekty z traitami Student i Pracownik, pokaż jak podatek
//  zadziała w zależności od kolejności w jakiej te traity zostały dodane przy tworzeniu obiektu.
  def main(args: Array[String]): Unit = {
  val student = new Osoba5("Pjatkomir", "Studencki", 20) with Student
  val worker = new Osoba5("Pjatkomir", "Pracowniczy", 20) with Pracownik
  worker.pensja = 2000
  val teacher = new Osoba5("Pjatkomir", "Nauczycielski", 20) with Nauczyciel
  teacher.pensja = 2000
  val studentWorker = new Osoba5("Pjatkomir", "Studencko-Pracowniczy", 20) with Student with Pracownik
  studentWorker.pensja = 1500
  val workerStudent = new Osoba5("Pjatkomir", "Pracowniczo-Studencki", 20)  with Pracownik with Student
  workerStudent.pensja = 2500

  println(s"Podatek dla ${student.imie} ${student.nazwisko} z traitem Student wynosi ${student.podatek}")
  println(s"Podatek dla ${worker.imie} ${worker.nazwisko} z traitem Pracownik wynosi ${worker.podatek}")
  println(s"Podatek dla ${teacher.imie} ${teacher.nazwisko} z traitem Nauczyciel wynosi ${teacher.podatek}")
  println(s"Podatek dla ${studentWorker.imie} ${studentWorker.nazwisko} z traitem Student i Pracownik wynosi ${studentWorker.podatek}")
  println(s"Podatek dla ${workerStudent.imie} ${workerStudent.nazwisko} z traitem Pracownik i Student wynosi ${workerStudent.podatek}")
  }
}
