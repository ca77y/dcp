
package pl.tom.algorithms.dailycode

/**
  * Given a binary tree, return all paths from the root to leaves.
  * 
  * For example, given the tree
  * 
  * it should return [[1, 2], [1, 3, 4], [1, 3, 5]].
  */

object Problem110 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    