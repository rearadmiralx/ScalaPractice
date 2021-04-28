package Fundamentals

object Hello{
  // CHeck number if perfect square
  def isSquare(x: Int): Boolean = {
    math.sqrt(x).isWhole
  }



  def main(args: Array[String]): Unit = {
    println(isSquare(64))
    println(1234567%13)
  }
}
