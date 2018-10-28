
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Boggle is a game played on a 4 x 4 grid of letters. The goal is to find as many
  * words as possible that can be formed by a sequence of adjacent letters in the
  * grid, using each cell at most once. Given a game board and a dictionary of valid
  * words, implement a Boggle solver.
  */

object Problem227 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    