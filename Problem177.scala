
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Airbnb.
  * 
  * Given a linked list and a positive integer k, rotate the list to the right by k 
  * places.
  * 
  * For example, given the linked list 7 -> 7 -> 3 -> 5 and k = 2, it should become 
  * 3 -> 5 -> 7 -> 7.
  * 
  * Given the linked list 1 -> 2 -> 3 -> 4 -> 5 and k = 3, it should become 3 -> 4
  * -> 5 -> 1 -> 2.
  */

object Problem177 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    