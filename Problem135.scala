
package pl.tom.algorithms.dailycode

/**
  * This question was asked by Apple.
  * 
  * Given a binary tree, find a minimum path sum from root to a leaf.
  * 
  * For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.
  * 
  *   10
  *  /  \
  * 5    5
  *  \     \
  *    2    1
  *        /
  *      -1
  */

object Problem135 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    