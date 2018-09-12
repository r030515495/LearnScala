package ch3

object exercise {
  def main(args: Array[String]): Unit = {
    printValue("20")
    printValue(null)


    println(getResult(10.0))
    println(getResult(0.0))
    println(getResult(-10))

    println(getResultByMatch(10.0))
    println(getResultByMatch(0.0))
    println(getResultByMatch(-10))


    for (x <- 1 to 100) {
      if (x % 5 == 0) {
        println(x)
      } else {
        print(s"${x} ,")
      }
    }

    for (s <- 1 to 100) {
      s match {
        case s if (s % 15) == 0 => println(s"${s} type safe")
        case x if x % 3 == 0 => println(s"${x} type")
        case x if x % 5 == 0 => println(s"${x} safe")
        case _ => println(s)
      }

    }

    for (i <- 1 to 100) { var s = ""; if (i%3==0) s="type"; if (i%5==0) s+="safe"; if(s.isEmpty) s += i; println(s) }

  }

  def printValue(x: String): Unit = {
    if (x == null) {
      println("n/a")
    } else {
      println(x)
    }
  }

  def getResult(x: Double): String = {
    if (x == 0)
      "same"
    else if ((x > 0))
      "greater"
    else
      "less"
  }

  def getResultByMatch(x: Double): String = {
    x match {
      case s if s == 0 => "same"
      case s if s > 0 => "greater"
      case s if s < 0 => "less"
    }
  }
}
