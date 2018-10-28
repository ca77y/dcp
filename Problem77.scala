
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Snapchat.
  * 
  * Given a list of possibly overlapping intervals, return a new list of intervals where all overlapping intervals have been merged.
  * 
  * The input list is not necessarily ordered in any way.
  * 
  * For example, given [(1, 3), (5, 8), (4, 10), (20, 25)], you should return [(1, 3), (4, 10), (20, 25)].
  */

object Problem77 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    