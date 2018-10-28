
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a node in a binary tree, return the next bigger element, also known as the
  * inorder successor.
  * 
  * For example, the inorder successor of 22 is 30.
  * 
  *    10
  *   /  \
  *  5    30
  *      /  \
  *    22    35
  * 
  * 
  * You can assume each node has a parent pointer.
  */

object Problem133 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    