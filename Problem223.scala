
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Palantir.
  * 
  * Typically, an implementation of in-order traversal of a binary tree has O(h) 
  * space complexity, where h is the height of the tree. Write a program to compute
  * the in-order traversal of a binary tree using O(1) space.
  */

object Problem223 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    