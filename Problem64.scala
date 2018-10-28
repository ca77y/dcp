
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * A closed knight's tour is a sequence of moves by a knight on a chessboard such that all squares are visited once and the knight returns back to its original square.
  * 
  * Given N, write a function to return the number of closed knight's tours on an N by N chessboard, with each knight starting at (0, 0).
  */

object Problem64 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    