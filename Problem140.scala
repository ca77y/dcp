
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given an array of integers in which two elements appear exactly once and all
  * other elements appear exactly twice, find the two elements that appear only
  * once.
  * 
  * For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The
  * order does not matter.
  * 
  * Follow-up: Can you do this in linear time and constant space?
  */

object Problem140 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    