
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Let X be a set of n intervals on the real line. We say that a set of points P
  * "stabs" X if every interval in X contains at least one point in P. Compute the
  * smallest set of points that stabs X.
  * 
  * For example, given the intervals [(1, 4), (4, 5), (7, 9), (9, 12)], you should
  * return [4, 9].
  */

object Problem200 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    