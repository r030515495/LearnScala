package ch3

object expression {
  def main(args: Array[String]): Unit = {
    val x = 5 * 20;
    val amount = x + 10
    println(amount)

    val amount2 = {
      val x = 5 * 20;
      x + 10
    }
    println(amount2)

    val finalValue = {
      val a = 1;
      {
        val b = a * 2;
        {
          val c = b + 4; c
        }
      }
    }
    println(finalValue)
  }
}
