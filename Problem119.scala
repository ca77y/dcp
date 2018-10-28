
package pl.tom.algorithms.dailycode

/**
  * If there are multiple smallest sets, return any of them.</p>
  * <p>For example, given the intervals <code>[0, 3], [2, 6], [3, 4], [6, 9]</code>, one set of numbers that covers
  * all these intervals is <code>{3, 6}</code>.</p>
  */

object Problem119 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    