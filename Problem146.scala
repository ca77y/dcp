
package pl.tom.algorithms.dailycode

/**
  * This question was asked by BufferBox.
  * 
  * Given a binary tree where all nodes are either 0 or 1, prune the tree so that
  * subtrees containing all 0s are removed.
  * 
  * For example, given the following tree:
  * 
  *    0
  *   / \
  *  1   0
  *     / \
  *    1   0
  *   / \
  *  0   0
  * 
  * 
  * should be pruned to:
  * 
  *    0
  *   / \
  *  1   0
  *     /
  *    1
  * 
  * 
  * We do not remove the tree at the root or its left child because it still has a 1 
  * as a descendant.
  */

object Problem146 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    