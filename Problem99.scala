
package pl.tom.algorithms.dailycode

/**
  * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
  * 
  * For example, given [100, 4, 200, 1, 3, 2], the longest consecutive element sequence is [1, 2, 3, 4]. Return its length: 4.
  * 
  * Your algorithm should run in O(n) complexity.
  */

object Problem99 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    