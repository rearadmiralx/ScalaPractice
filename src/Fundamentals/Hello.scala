package Fundamentals

object Hello {
  // CHeck number if perfect square
  def isSquare(x: Int): Boolean = {
    math.sqrt(x).isWhole
  }

  def main(args: Array[String]): Unit = {
    println(isSquare(64))
    println(1234567 % 13)
  }
}

object Bus extends App {
  def number(busStops: List[(Int, Int)]): Int = {
    busStops.map(_._1).sum - busStops.map(_._2).sum
  }

  // this the other way to do it
  def number2(busStops: List[(Int, Int)]): Int = {
    busStops.map { case (on, off) => on - off }.sum
  }
  /*  println(number(List((10, 0), (3, 5), (5, 8))))
    println(number(List((3, 0), (9, 1), (4, 10), (12, 2), (6, 1), (7, 10))))*/

  // This return the number of count of letters > m / size in String format
  def printerError(s: String): String = {
    s.toLowerCase.count("nopqrstuvwxyz".contains(_)).toString + "/" + s.size
  }
  // other way to do it
  /*def printerError(s: String): String = {
    val errors = s.count(_ > 'm')
    val total = s.size
    s"$errors/$total"
  }*/

  // This would return the int of a1.max - a2.min and reverse if a2.max - a1.min
  def mxdiflg(a1: List[String], a2: List[String]): Int = {
    if(a1. isEmpty || a2.isEmpty) -1
    else math.max(a1.maxBy(_.length).size - a2.minBy(_.length).size ,
      a2.maxBy(_.length).size - a1.minBy(_.length).size)
  }
  // Other way to implement this is
  /*def mxdiflg(a1: List[String], a2: List[String]): Int =
    (for { x <- a1; y <- a2 } yield (y.size - x.size).abs) match { case Nil => -1 case l => l.max }
}*/

  /*val a1 = List("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
  val a2 = List("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
  val result = 13

  println(mxdiflg(a1, a2))
  println("oocccffuucccjjjkkkjyyyeehh".size - "bbbaaayddqbbrrrv".size)*/
  //  println("cccooommaaqqoxii".size -"hoqq".size)
  //  println(printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu"))
  //val mainList = List(3, 2, 1)
  //  val with4 =    4 :: mainList  // re-uses mainList, costs one :: instance
  //  val with42 =   42 :: mainList // also re-uses mainList, cost one :: instance
  //  val shorter =  mainList.tail  // costs nothing as it uses the same 2::1::Nil instances as mainList
  //println(mainList)

}

object Rain extends App {
//  def mean(town: String, strng: String): Double = {
//    if(town.isEmpty) -1
////    else strng.groupMap(rome => rome.
//
//  }
  var data: String = "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
    "\n" +
    "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
    "\n" +
    "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
    "\n" +
    "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
    "\n" +
    "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
    "\n" +
    "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
    "\n" +
    "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
    "\n" +
    "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
    "\n" +
    "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
    "\n" +
    "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7"

//  println(mean("Rome", data))
  def variance(town: String, strng: String): Double = ???
}

