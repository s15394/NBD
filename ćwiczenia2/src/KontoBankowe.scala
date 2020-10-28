class KontoBankowe(private var _stanKonta: BigDecimal = 0) {

  def stanKonta = _stanKonta

  def wplata(wysokoscWplaty: BigDecimal): Unit = {
    if (wysokoscWplaty > 0) {
    _stanKonta = _stanKonta + wysokoscWplaty
    }
  }

  def wyplata(wysokoscWyplaty: BigDecimal): Unit = {
    if (wysokoscWyplaty < 0 && wysokoscWyplaty > _stanKonta) {
      throw new Exception("Nie można wypłacić więcej niż posiada się na koncie")
    }
    _stanKonta = _stanKonta - wysokoscWyplaty
  }
}
