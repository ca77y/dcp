
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a string of parentheses, find the balanced string that can be produced
  * from it using the minimum number of insertions and deletions. If there are
  * multiple solutions, return any of them. 
  * 
  * For example, given "(()", you could return "(())". Given "))()(", you could
  * return "()()()()".
  */

object Problem199 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    