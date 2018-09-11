package ch2

object Tuple {


  def main(args: Array[String]): Unit = {
    val info = (5, "Korben", true)
    println(info)
    println(info._1)
    println(info._2)
    println(info._3)

    val red = "red" -> "0xff0000"
    println(red)
    val reversed = red._2 -> red._1
    println(reversed)
  }
}
