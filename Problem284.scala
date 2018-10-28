
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Yext.
  * 
  * Two nodes in a binary tree can be called cousins if they are on the same level
  * of the tree but have different parents. For example, in the following diagram 4 
  * and 6 are cousins.
  * 
  *     1
  *    / \
  *   2   3
  *  / \   \
  * 4   5   6
  * 
  * 
  * Given a binary tree and a particular node, find all cousins of that node.
  */

object Problem284 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    