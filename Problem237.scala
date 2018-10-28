
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * A tree is symmetric if its data and shape remain unchanged when it is reflected
  * about the root node. The following tree is an example:
  * 
  *         4
  *       / | \
  *     3   5   3
  *   /           \
  * 9              9
  * 
  * 
  * Given a k-ary tree, determine whether it is symmetric.
  */

object Problem237 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    