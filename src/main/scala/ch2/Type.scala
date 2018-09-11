package ch2

object Type {


  def main(args: Array[String]): Unit = {
    val c = 'A'
    val i: Int = c
    println(s"c:${c}")
    println(s"i:${i}")
    val t: Char = 116
    println(s"t:${t}")

    val isTrue = true
    println(s"isTrue:${isTrue}")
    val isFalse = !true
    println(s"isFalse:${isTrue}")
    val unequal = 5 != 6
    println(s"unequal:${unequal}")
    val isLess = (5 < 6)
    println(s"isLess:${isLess}")
    val unequalAndLess = unequal & isLess
    println(s"unequalAndLess:${unequalAndLess}")
    val definitelyFalse = false && unequal
    println(s"definitelyFalse:${definitelyFalse}")
    val nada = ()
    println(nada)
    // asInstanceOf not suggest, if type not convert, then get a error
    val types = 5.asInstanceOf[Long]
    println(types)
    // compile error
    //    val types2 = (10000000000).asInstanceOf[Int]
    //    println(types2)
    println((7.0 / 5).getClass)
    println((5.0).isInstanceOf[Float])
    println((5.0f).isInstanceOf[Float])
    println("A".hashCode)
    println(20.toByte)
    println(40.toFloat)
    println((3.0 / 4.0).toString)
  }
}
