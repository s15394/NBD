trait Pracownik extends Osoba5 {
  protected var _pensja: BigDecimal = 0

  override def podatek: BigDecimal = _pensja * 0.2
  def pensja: BigDecimal = _pensja

  def pensja_=(nowaPensja: BigDecimal): Unit = {
    _pensja = nowaPensja
  }
}
