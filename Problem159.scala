
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given a string, return the first recurring character in it, or null if there is
  * no recurring chracter.
  * 
  * For example, given the string "acbbac", return "b". Given the string "abcdef",
  * return null.
  */

object Problem159 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    