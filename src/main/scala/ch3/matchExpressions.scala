package ch3

object matchExpressions {
  def main(args: Array[String]): Unit = {
    val x = 10
    val y = 20
    val max2 = x > y match {
      case true => x
      case false => y
    }
    println(max2)

    val status = 500
    val message = status match {
      case 200 =>
        "ok"
      case 400 => {
        println("Error -we called the service incorrectly")
        "error"
      }
      case 500 => {
        println("Error the servie encountered an error")
        "error"
      }
    }

    println(message)
    val day = "MON"
    val kind = day match {
      case "MON" | "TUE" | "WEB" | "THU" | "FRI" =>
        "weekday"
      case "SAT" | "SUN" =>
        "weekend"
    }

    println(kind)

    // get Match error
    //    val b = "match me" match {
    //      case "nope" => "sorry"
    //    }
    //    println(b)


    val c = "match me" match {
      case "nope" => "sorry"
      case other => {
        println(s"can't parse $other")
        "none"
      }
    }
    println(c)
    val message2 = "match me"
    val d = message2 match {
      case "nope" => "sorry"
      case _ => {
        println(s"can't parse $message2")
        "none"
      }
    }
    println(d)

    // pattren guard

    val response: String = null

    response match {
      case s if s != null => println(s"Receive $s")
      case s => println("response is null")
    }

    // match by Type
    val x1: Int = 12180
    val y1: Any = x1
    var result = y1 match {
      case y1: String => s"'x'"
      case y1: Double => s"$x1"
      case y1: Long => s"${x1}l"
      case y1: Int => s"${x1}i"
    }

    println(result)

  }
}
