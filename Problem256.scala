
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Fitbit.
  * 
  * Given a linked list, rearrange the node values such that they appear in
  * alternating low -> high -> low -> high ... form. For example, given 1 -> 2 -> 3
  * -> 4 -> 5, you should return 1 -> 3 -> 2 -> 5 -> 4.
  */

object Problem256 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    