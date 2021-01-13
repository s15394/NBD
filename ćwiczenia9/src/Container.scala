case class Container[A](private val value: A) {

  def getContent = value

  def applyFunction[R](function: A => R) = {
    Container(function.apply(value))
  }
}
