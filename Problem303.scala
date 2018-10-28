
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Given a clock time in hh:mm format, determine, to the nearest degree, the angle
  * between the hour and the minute hands.
  * 
  * Bonus: When, during the course of a day, will the angle be zero?
  */

object Problem303 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    