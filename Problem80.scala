
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given the root of a binary tree, return a deepest node. For example, in the following tree, return d.
  */

object Problem80 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    