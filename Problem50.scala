
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Suppose an arithmetic expression is given as a tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.
  * 
  * Given the root to such a tree, write a function to evaluate it.
  */

object Problem50 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    