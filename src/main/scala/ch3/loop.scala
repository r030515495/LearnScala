package ch3

object loop {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 7) {
      println(x)
    }


    val reuslt = for (x <- 1 to 7) yield {
      s"Day $x:"
    }

    println(reuslt)

    for (day <- reuslt) println(day + ",")

    // iterator guard
    val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
    println(threes)

    val quote = "Faith,Hope,Charity"
    for {t <- quote.split(",") if t != null if t.size > 0} {
      println(t)
    }

    for {x <- 1 to 2
         y <- 1 to 3} {
      println(s"${x},${y}")
    }

    val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
    println(powersOf2)

    var while1 = 10;
    while (while1 > 0) {
      while1 -= 1
    }
    println(while1)

    val temp1 = 0
    do println(s" temp = $temp1") while (temp1 > 0)
  }
}
