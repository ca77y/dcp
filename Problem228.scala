
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Twitter.
  * 
  * Given a list of numbers, create an algorithm that arranges them in order to form
  * the largest possible integer. For example, given [10, 7, 76, 415], you should
  * return 77641510.
  */

object Problem228 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    