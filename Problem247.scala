
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Paypal.
  * 
  * Given a binary tree, determine whether or not it is height-balanced. A
  * height-balanced binary tree can be defined as one in which the heights of the
  * two subtrees of any node never differ by more than one.
  */

object Problem247 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    