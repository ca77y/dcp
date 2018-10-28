
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Uber.
  * 
  * Suppose an array sorted in ascending order is rotated at some pivot unknown to
  * you beforehand. Find the minimum element in O(log N) time. You may assume the
  * array does not contain duplicates.
  * 
  * For example, given [5, 7, 10, 3, 4], return 3.
  */

object Problem203 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    