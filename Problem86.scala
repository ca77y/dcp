
package pl.tom.algorithms.dailycode

/**
  * Given a string of parentheses, write a function to compute the minimum number of parentheses to be removed to make the string valid (i.e. each open parenthesis is eventually closed).
  * 
  * For example, given the string "()())()", you should return 1. Given the string ")(", you should return 2, since we must remove all of them.
  */

object Problem86 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    