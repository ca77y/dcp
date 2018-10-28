
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by IBM.
  * 
  * Given an integer, find the next permutation of it in absolute order. For
  * example, given 48975, the next permutation would be 49578.
  */

object Problem205 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    