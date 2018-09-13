package ch4

import scala.annotation.tailrec

object recursive {
  def main(args: Array[String]): Unit = {
    println(power(10, 10))
    println(power(2, 10))
    println(power(2, 0))


    println(powerTail(2, 8))
    println(powerTail(2, 10))
    println(powerTail(2, 1))

    println(max(42, 181, 19))

    println(greet("Rex", "Li"));
    println(greet(name = "Rex", prefix = "Li"));

    println(greet2(name = "aa"))

    //varargs
    println(sum(10, 20, 30))

    println(max(10)(20))

    println(identity("aa"))


    println(identitiy2("rex"))
    println(identitiy2(1))

    val s = "vacation.jpg"
    val isJPG = s.endsWith(".jpg")
    println(isJPG)

    val d = 65.642
    println("round:" + d.round)
    println("floor:" + d.floor)
    println("compareTo:" + d.compareTo(18.0))
    println("plus:" + d.+(2.721))

    val x = d compareTo 20
    println("x=" + x)
  }

  def power(x: Int, n: Int): Long = {
    if (n >= 1) x * power(x, n - 1)
    else 1
  }

  // GET ERROR
  //  @tailrec
  //  def powerTail(x: Int, n: Int): Long = {
  //    if (n >= 1) x * powerTail(x, n - 1)
  //    else 1
  //  }

  @tailrec
  def powerTail(x: Int, n: Int, t: Int = 1): Long = {
    if (n < 1) t
    else powerTail(x, n - 1, x * t)
  }

  def max(a: Int, b: Int, c: Int) = {
    def max(x: Int, y: Int) = if (x > y) x else y

    max(a, max(b, c))
  }

  def greet(prefix: String, name: String) = s"$prefix $name"

  def greet2(prefix: String = "", name: String) = s"$prefix $name"


  def sum(items: Int*): Int = {
    var total = 0
    for (i <- items) total += i
    total
  }

  def max(x: Int)(y: Int) = if (x > y) x else y

  def identity(s: String): String = s


  def identitiy2[A](a: A): A = a

  /**
    * AA
    */
  def safeTrim(s: String): String = {
    if (s == null) return null
    s.trim()
  }
}
