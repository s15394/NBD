case class Yes[A](private val value: A) extends Maybe[A]{
  override def applyFunction[R](f: A => R): Maybe[R] = Yes(f.apply(value))

  override def getOrElse[R >: A](parameter: => R): R = value

  override def map[R](f: A => R): Maybe[R] = Yes(f(value))

  override def flatMap[R](f: A => Maybe[R]): Maybe[R] = f(value)
}
