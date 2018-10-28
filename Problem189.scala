
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given an array of elements, return the length of the longest subarray where all
  * its elements are distinct.
  * 
  * For example, given the array [5, 1, 3, 5, 2, 3, 4, 1], return 5 as the longest
  * subarray of disctinct elements is [5, 2, 3, 4, 1].
  */

object Problem189 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    