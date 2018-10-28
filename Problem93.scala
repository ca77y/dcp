
package pl.tom.algorithms.dailycode

/**
  * Given a tree, find the largest tree/subtree that is a BST.
  * 
  * Given a tree, return the size of the largest tree/subtree that is a BST.
  */

object Problem93 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    