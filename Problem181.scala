
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given a string, split it into as few strings as possible such that each string
  * is a palindrome.
  * 
  * For example, given the input string racecarannakayak, return ["racecar", "anna",
  * "kayak"].
  * 
  * Given the input string abc, return ["a", "b", "c"].
  */

object Problem181 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    