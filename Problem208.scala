
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by LinkedIn.
  * 
  * Given a linked list of numbers and a pivot k, partition the linked list so that
  * all nodes less than k come before nodes greater than or equal to k. 
  * 
  * For example, given the linked list 5 -> 1 -> 8 -> 0 -> 3 and k = 3, the solution
  * could be 1 -> 0 -> 5 -> 8 -> 3.
  */

object Problem208 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    