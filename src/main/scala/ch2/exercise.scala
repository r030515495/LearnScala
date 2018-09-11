package ch2

object exercise {
  def main(args: Array[String]): Unit = {
    println(cToF(7))
    println(cToF2(20))
    printString(2.7255)
    printBoolean()
    println(covertType())
    println(getPhoneNumber())
  }

  def cToF(x: Int): Any = {
    val step1 = x * 9
    println(step1)
    val step2 = step1 / 5.0
    println(step2)
    val step3 = step2 + 32
    step3
  }

  def cToF2(x: Int): Int = {
    val step1 = x * 9
    println(step1)
    val step2 = step1 / 5
    println(step2)
    val step3 = step2 + 32
    step3
  }

  def printString(value: Double): Unit = {
    println(f"You owe $$${value}%.2f ")
  }

  def printBoolean() = {
    val flag = false
    val result = !flag
    println(result)
  }

  def covertType() = {
    val i1 = 123
    val c: Char = i1.toChar
    val s :String= c.toString
    val d: Double =s{0}.toDouble
    val i = c.toInt
    i
  }

  def getPhoneNumber() = {
    val s = "Frank,123 Main,925-555-1943,95122"
    val partten = """.*(\d{3})-(\d{3})-(\d{4}).*""".r

    val partten(p1, p2, p3) = s
    (p1.toInt, p2.toInt, p3.toInt)
  }
}
