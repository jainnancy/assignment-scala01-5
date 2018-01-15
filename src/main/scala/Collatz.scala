
object Collatz extends App {

  val list = (1 to 1000).toList.map {
    x => if(x % 2 == 0) x/2 else 3 * x + 1}

  collatz(5);println()
  collatz(160);println()
  collatz(3);println()
  collatz(46);println()
  def collatz(x: Int): Unit = {
    x match {
    case x if x == 1 => print("1")
    case x => {
      print(s"$x, ")
      collatz(list(x - 1))
    }
  }
  }
}
