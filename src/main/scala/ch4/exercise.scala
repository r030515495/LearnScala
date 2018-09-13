package ch4

object exercise {
  def main(args: Array[String]): Unit = {
    println(pie(10))

  }

  def pie(s: Double): Double = {
    s * s * 3.14
  }
}
