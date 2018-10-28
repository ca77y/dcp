
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given an N by N matrix, rotate it by 90 degrees clockwise.
  * 
  * For example, given the following matrix:
  * 
  * [[1, 2, 3],
  *  [4, 5, 6],
  *  [7, 8, 9]]
  * 
  * 
  * you should return:
  * 
  * [[7, 4, 1],
  *  [8, 5, 2],
  *  [9, 6, 3]]
  * 
  * 
  * Follow-up: What if you couldn't use any extra space?
  */

object Problem168 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    