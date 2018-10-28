
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Apple.
  * 
  * Given the root of a binary tree, find the most frequent subtree sum. The subtree
  * sum of a node is the sum of all values under a node, including the node itself.
  * 
  * For example, given the following tree:
  * 
  *   5
  *  / \
  * 2  -5
  * 
  * 
  * Return 2 as it occurs twice: once as the left leaf, and once as the sum of 2 + 5
  * - 5.
  */

object Problem196 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    