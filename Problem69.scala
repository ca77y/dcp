
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a list of integers, return the largest product that can be made by multiplying any three integers.
  * 
  * For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.
  * 
  * You can assume the list has at least three integers.
  */

object Problem69 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    