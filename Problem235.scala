
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given an array of numbers of length N, find both the minimum and maximum using
  * less than 2 * (N - 2) comparisons.
  */

object Problem235 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    