
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * You're given a string consisting solely of (, ), and *. * can represent either a 
  * (, ), or an empty string. Determine whether the parentheses are balanced.
  * 
  * For example, (()* and (*) are balanced. )*( is not balanced.
  */

object Problem142 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    