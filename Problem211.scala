
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Given a string and a pattern, find the starting indices of all occurrences of
  * the pattern in the string. For example, given the string "abracadabra" and the
  * pattern "abr", you should return [0, 7].
  */

object Problem211 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    