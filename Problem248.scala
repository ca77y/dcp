
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Nvidia.
  * 
  * Find the maximum of two numbers without using any if-else statements, branching,
  * or direct comparisons.
  */

object Problem248 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    