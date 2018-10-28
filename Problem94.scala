
package pl.tom.algorithms.dailycode

/**
  * Given a tree of integers, find the maximum path sum between two nodes. The path must go through at least one node, and does not need to go through the root.
  */

object Problem94 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    