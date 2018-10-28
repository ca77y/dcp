
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a positive integer n, find the smallest number of squared integers which
  * sum to n.
  * 
  * For example, given n = 13, return 2 since 13 = 32 + 22 = 9 + 4.
  * 
  * Given n = 27, return 3 since 27 = 32 + 32 + 32 = 9 + 9 + 9.
  */

object Problem156 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    