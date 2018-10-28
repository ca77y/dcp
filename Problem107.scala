
package pl.tom.algorithms.dailycode

/**
  * Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.
  */

object Problem107 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    