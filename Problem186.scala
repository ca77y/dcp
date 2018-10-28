
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Given an array of positive integers, divide the array into two subsets such that
  * the difference between the sum of the subsets is as small as possible.
  * 
  * For example, given [5, 10, 15, 20, 25], return the sets {10, 25} and {5, 15, 20}
  * , which has a difference of 5, which is the smallest possible difference.
  */

object Problem186 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    