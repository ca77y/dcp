
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Etsy.
  * 
  * Given an array of numbers N and an integer k, your task is to split N into k 
  * partitions such that the maximum sum of any partition is minimized. Return this
  * sum.
  * 
  * For example, given N = [5, 1, 2, 7, 3, 4] and k = 3, you should return 8, since
  * the optimal partition is [5, 1, 2], [7], [3, 4].
  */

object Problem243 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    