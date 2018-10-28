
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by IBM.
  * 
  * Given a string with repeated characters, rearrange the string so that no two
  * adjacent characters are the same. If this is not possible, return None.
  * 
  * For example, given "aaabbc", you could return "ababac". Given "aaab", return 
  * None.
  */

object Problem231 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    