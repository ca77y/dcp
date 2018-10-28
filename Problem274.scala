
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a string consisting of parentheses, single digits, and positive and
  * negative signs, convert the string into a mathematical expression to obtain the
  * answer.
  * 
  * Don't use eval or a similar built-in parser.
  * 
  * For example, given '-1 + (2 + 3)', you should return 4.
  */

object Problem274 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    