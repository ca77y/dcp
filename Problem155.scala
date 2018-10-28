
package pl.tom.algorithms.dailycode

/**
  * Given a list of elements, find the majority element, which appears more than
  * half the times (> floor(len(lst) / 2.0)).
  * 
  * You can assume that such element exists.
  * 
  * For example, given [1, 2, 1, 1, 3, 4, 0], return 1.
  */

object Problem155 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    