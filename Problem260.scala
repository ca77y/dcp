
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Pinterest.
  * 
  * The sequence [0, 1, ..., N] has been jumbled, and the only clue you have for its
  * order is an array representing whether each number is larger or smaller than the
  * last. Given this information, reconstruct an array that is consistent with it.
  * For example, given [None, +, +, -, +], you could return [1, 2, 3, 0, 4].
  */

object Problem260 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    