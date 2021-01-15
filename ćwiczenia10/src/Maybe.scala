trait Maybe[+A] {
  def applyFunction[R](f: A => R): Maybe[R]
  def getOrElse[R >: A](parameter: => R): R
  def map[R](f: A => R): Maybe[R]
  def flatMap[R](f: A => Maybe[R]): Maybe[R]
}
