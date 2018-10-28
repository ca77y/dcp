
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Oracle.
  * 
  * Given a binary search tree, find the floor and ceiling of a given integer. The
  * floor is the highest element in the tree less than or equal to an integer, while
  * the ceiling is the lowest element in the tree greater than or equal to an
  * integer.
  * 
  * If either value does not exist, return None.
  */

object Problem307 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    