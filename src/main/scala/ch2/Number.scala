package ch2

object Number {
  def main(args: Array[String]): Unit = {
    // Byte -128 ~ 128
    val b: Byte = 10
    println(b)
    // Short -32768 ~ 32767
    val s: Short = b
    println(s)
    val d: Double = s
    println(d)
    //    val l: Long = 20
    //    val i: Int = l
    //    Long can't convert to Int
    // Long -2^63 2^63-1
    val l: Long = 20
    val i: Int = l.toInt
    println(i)
    // Int -2^31 2^31-1
    val int1 = 5
    val int2 = 0x0f
    println("0x0f=" + int2)
    val long = 5l
    println(long)
    val double1 = 0.5
    val double2 = 1.0
    val double3 = 5d
    val double4 = 5D

    println("double1=" + double1)
    println("double2=" + double2)
    println("double3=" + double3)
    println("double4=" + double4)

    val float1 = 5f
    val float2 = 5F

    println("float1=" + float1)
    println("float2=" + float2)
  }
}
