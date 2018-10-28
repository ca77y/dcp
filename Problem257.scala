
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by WhatsApp.
  * 
  * Given an array of integers out of order, determine the bounds of the smallest
  * window that must be sorted in order for the entire array to be sorted. For
  * example, given [3, 7, 5, 6, 9], you should return (1, 3).
  */

object Problem257 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    