package ch2

object String {
  def main(args: Array[String]): Unit = {
    val hello = "Hello world"
    println(hello)
    val signature = "Hello \n world"
    println(signature)

    val greeting = "Hello, world"
    val matched = (greeting == "Hello, world")
    println(matched)
    val theme = "La!" * 20 + "Ha!"
    println(theme)

    val mutilLine =
      """she is
        | \t 123
      """

    println(mutilLine)

    val approx = 355 / 113f
    println("Pi, using 355/113, is about " + approx + ".")
    println(s"Pi, using 355/113, is about $approx.")
    println(s"Pi, using 355/113, is about ${approx}.")
    println(s"Pi, using 355/113 * 10, is about ${approx * 10}.")
    println(s"Fish ${"n" * 3}")

    val item = "apple"
    println(f"I wrote a new  $item%.3s today")
    println(f"Enjoying this $item ${355 / 113.0}%.10f item today")

    //regex
    //    matches
    println("Froggy went a' courting" matches (".* courting"))
    // replaceAll
    println("milk, tea, muck" replaceAll("m[^ ]+k", "coffee"))
    //replaceFirst
    println("milk, tea, muck" replaceFirst("m[^ ]+k", "coffee"))
  }
}
