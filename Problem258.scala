
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Morgan Stanley.
  * 
  * In Ancient Greece, it was common to write text with the first line going left to
  * right, the second line going right to left, and continuing to go back and forth.
  * This style was called "boustrophedon".
  * 
  * Given a binary tree, write an algorithm to print the nodes in boustrophedon
  * order.
  * 
  * For example, given the following tree:
  * 
  *        1
  *     /     \
  *   2         3
  *  / \       / \
  * 4   5     6   7
  * 
  * 
  * You should return [1, 3, 2, 4, 5, 6, 7].
  */

object Problem258 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    