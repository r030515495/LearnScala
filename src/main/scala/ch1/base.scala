package ch1

object Base {
  def main(args: Array[String]): Unit = {
    test1()
  }

  def test1(): Unit = {
    println(123)
    println(cTof(60))
  }

  def cTof(x: Double): Double = {
    (x * 9 / 5) + 32
  }
}
