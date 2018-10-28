
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given a linked list, sort it in O(n log n) time and constant space.
  * 
  * For example, the linked list 4 -> 1 -> -3 -> 99 should become -3 -> 1 -> 4 -> 99
  * .
  */

object Problem169 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    