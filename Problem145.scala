
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given the head of a singly linked list, swap every two nodes and return its
  * head.
  * 
  * For example, given 1 -> 2 -> 3 -> 4, return 2 -> 1 -> 4 -> 3.
  */

object Problem145 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    