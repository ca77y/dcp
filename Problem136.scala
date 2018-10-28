
package pl.tom.algorithms.dailycode

/**
  * This question was asked by Google.
  * 
  * Given an N by M matrix consisting only of 1's and 0's, find the largest
  * rectangle containing only 1's and return its area.
  * 
  * For example, given the following matrix:
  * 
  * [[1, 0, 0, 0],
  *  [1, 0, 1, 1],
  *  [1, 0, 1, 1],
  *  [0, 1, 0, 0]]
  * 
  * 
  * Return 4.
  */

object Problem136 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    