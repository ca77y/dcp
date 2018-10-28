
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Dropbox.
  * 
  * Given a well-formed sudoku puzzle as a 2D array, write a function to solve it.
  */

object Problem54 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    