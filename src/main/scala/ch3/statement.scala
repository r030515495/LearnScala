package ch3

object statement {
  def main(args: Array[String]): Unit = {
    if (47 % 3 > 0) println("Not a multiple of 3")

    val result = if (false) "what does this return?"
    println(result)
    val x = 10
    val y = 20
    val max = if (x > y) x else y
    println(max)


  }
}
