
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given the head of a singly linked list, reverse it in-place.
  */

object Problem73 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    