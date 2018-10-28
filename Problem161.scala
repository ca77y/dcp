
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a 32-bit integer, return the number with its bits reversed.
  * 
  * For example, given the binary number 1111 0000 1111 0000 1111 0000 1111 0000,
  * return 0000 1111 0000 1111 0000 1111 0000 1111.
  */

object Problem161 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    