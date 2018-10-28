
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a circular array, compute its maximum subarray sum in O(n) time.
  * 
  * For example, given [8, -1, 3, 4], return 15 as we choose the numbers 3, 4, and 8 
  * where the 8 is obtained from wrapping around.
  * 
  * Given [-4, 5, 1, 0], return 6 as we choose the numbers 5 and 1.
  */

object Problem190 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    