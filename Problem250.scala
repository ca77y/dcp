
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * A cryptarithmetic puzzle is a mathematical game where the digits of some numbers
  * are represented by letters. Each letter represents a unique digit.
  * 
  * For example, a puzzle of the form:
  * 
  *   SEND
  * + MORE
  * --------
  *  MONEY
  * 
  * 
  * may have the solution:
  * 
  * {'S': 9, 'E': 5, 'N': 6, 'D': 7, 'M': 1, 'O', 0, 'R': 8, 'Y': 2}
  * 
  * 
  * Given a three-word puzzle like the one above, create an algorithm that finds a
  * solution.
  */

object Problem250 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    