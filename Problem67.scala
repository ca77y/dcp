
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Implement an LFU (Least Frequently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:
  * 
  * Each operation should run in O(1) time.
  */

object Problem67 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    