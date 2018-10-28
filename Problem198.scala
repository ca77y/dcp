
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given a set of distinct positive integers, find the largest subset such that
  * every pair of elements in the subset (i, j) satisfies either i % j = 0 or j % i
  * = 0.
  * 
  * For example, given the set [3, 5, 10, 20, 21], you should return [5, 10, 20].
  * Given [1, 3, 6, 24], return [1, 3, 6, 24].
  */

object Problem198 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    