
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Snapchat.
  * 
  * You are given an array of length N, where each element i represents the number
  * of ways we can produce i units of change. For example, [1, 0, 1, 1, 2] would
  * indicate that there is only one way to make 0, 2, or 3 units, and two ways of
  * making 4 units.
  * 
  * Given such an array, determine the denominations that must be in use. In the
  * case above, for example, there must be coins with value 2, 3, and 4.
  */

object Problem316 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    