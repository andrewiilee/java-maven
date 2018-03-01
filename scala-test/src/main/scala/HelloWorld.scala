object HelloWorld {
  def main(args: Array[String]) {
    println("Hello World!")
    println("pattern matching test")
    println("input = two, output = " + matchTest("two"))
    println("input = test, output = " + matchTest("test"))
    println("input = 1, output = " + matchTest(1))
    println("input = 1002, output = " + matchTest(1002))
  }

  //pattern matching test
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }

}