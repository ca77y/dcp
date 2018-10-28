
package pl.tom.algorithms.dailycode

/**
  * Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.
  * 
  * For example, [2, 0, 1, 0] returns true while [1, 1, 0, 1] returns false.
  */

object Problem106 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    