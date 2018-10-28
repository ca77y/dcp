
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a complete binary tree, count the number of nodes in faster than O(n)
  * time. Recall that a complete binary tree has every level filled except the last,
  * and the nodes in the last level are filled starting from the left.
  */

object Problem204 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    