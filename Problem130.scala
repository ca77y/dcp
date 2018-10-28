
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given an array of numbers representing the stock prices of a company in
  * chronological order and an integer k, return the maximum profit you can make
  * from k buys and sells. You must buy the stock before you can sell it, and you
  * must sell the stock before you can buy it again.
  * 
  * For example, given k = 2 and the array [5, 2, 4, 0, 1], you should return 3.
  */

object Problem130 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    