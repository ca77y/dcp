
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Yahoo.
  * 
  * Recall that a full binary tree is one in which each node is either a leaf node,
  * or has two children. Given a binary tree, convert it to a full one by removing
  * nodes with only one child.
  * 
  * For example, given the following tree:
  * 
  *          0
  *       /     \
  *     1         2
  *   /            \
  * 3                 4
  *   \             /   \
  *     5          6     7
  * 
  * 
  * You should convert it to:
  * 
  *      0
  *   /     \
  * 5         4
  *         /   \
  *        6     7
  */

object Problem254 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    