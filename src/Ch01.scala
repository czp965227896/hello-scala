object Ch01 {
  //ex.1
  def signum(x: Int): Int = {
    if (x > 0) 1 else if (x < 0) -1 else 0
  }

  //ex.2
  def getType(): Unit = {
    val a = {}
    println(a.getClass)
  }

  //ex.3
  def makeValid(): Unit = {
    //    x = y = 1
    var x: Unit = {}
    var y: Int = 0
    x = y = 1
  }

  //ex.4
  def reverseDisplay(): Unit = {
    for (x <- (0 to 10).reverse) println(x)
  }

  //ex.5
  def countdown(n: Int): Unit = {
    for (x <- (0 to n).reverse) println(x)
  }

  //ex.6
  def unicodeSum() = {
    var i: Long = 1L
    for (c <- "Hello") i *= c.toLong
    println(i)
  }

  //ex.7
  def unicodeSum2() = {
    var res: Long = 1L
    "Hello".foreach(res *= _.toLong)
    println(res)
  }

  //ex.8
  def product(s: String)= {
    s.foldLeft(1L){_*_}
  }


  def main(args: Array[String]): Unit = {
    //    println(signum(10))
    //    getType()
    //    reverseDisplay()
    //    countdown(6)
    unicodeSum2()
  }
}
