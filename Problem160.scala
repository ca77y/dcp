
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Uber.
  * 
  * Given a tree where each edge has a weight, compute the length of the longest
  * path in the tree.
  * 
  * For example, given the following tree:
  * 
  *    a
  *   /|\
  *  b c d
  *     / \
  *    e   f
  *   / \
  *  g   h
  * 
  * 
  * and the weights: a-b: 3, a-c: 5, a-d: 8, d-e: 2, d-f: 4, e-g: 1, e-h: 1, the
  * longest path would be b -> a -> d -> f, with a length of 15.
  * 
  * The path does not have to pass through the root, and each node can have any
  * amount of children.
  */

object Problem160 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    