
package pl.tom.algorithms.dailycode

/**
  * Given a word W and a string S, find all starting indices in S which are anagrams of W.
  * 
  * For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.
  */

object Problem111 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    