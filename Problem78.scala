
package pl.tom.algorithms.dailycode

/**
  * This problem was asked recently by Google.
  * 
  * Given k sorted singly linked lists, write a function to merge all the lists into one sorted singly linked list.
  */

object Problem78 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    