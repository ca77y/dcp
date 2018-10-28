
package pl.tom.algorithms.dailycode

/**
  * This question was asked by Snapchat.
  * 
  * Given the head to a singly linked list, where each node also has a “random”
  * pointer that points to anywhere in the linked list, deep clone the list.
  */

object Problem131 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    