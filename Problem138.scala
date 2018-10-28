
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Find the minimum number of coins required to make n cents.
  * 
  * You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.
  * 
  * For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a
  * 1¢.
  */

object Problem138 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    