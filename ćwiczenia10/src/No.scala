case class No() extends Maybe[Nothing] {
  override def applyFunction[R](f: Nothing => R): Maybe[R] = No()

  override def getOrElse[R >: Nothing](parameter: => R): R = parameter

  override def map[R](f: Nothing => R): Maybe[R] = No()

  override def flatMap[R](f: Nothing => Maybe[R]): Maybe[R] = No()
}
