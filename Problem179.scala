
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given the sequence of keys visited by a postorder traversal of a binary search
  * tree, reconstruct the tree.
  * 
  * For example, given the sequence 2, 4, 3, 8, 7, 5, you should construct the
  * following tree:
  * 
  *     5
  *    / \
  *   3   7
  *  / \   \
  * 2   4   8
  */

object Problem179 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    