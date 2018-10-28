
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Dropbox.
  * 
  * Create an algorithm to efficiently compute the approximate median of a list of
  * numbers.
  * 
  * More precisely, given an unordered list of N numbers, find an element whose rank
  * is between N / 4 and 3 * N / 4, with a high level of certainty, in less than 
  * O(N) time.
  */

object Problem323 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    