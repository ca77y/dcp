
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Quora.
  * 
  * Given an absolute pathname that may have . or .. as part of it, return the
  * shortest standardized path.
  * 
  * For example, given "/usr/bin/../bin/./scripts/../", return "/usr/bin/".
  */

object Problem222 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    