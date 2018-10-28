
package pl.tom.algorithms.dailycode

/**
  * Given two strings A and B, return whether or not A can be shifted some number of times to get B.
  * 
  * For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.
  */

object Problem108 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    