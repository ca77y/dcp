
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Wayfair.
  * 
  * You are given a 2 x N board, and instructed to completely cover the board with
  * the following shapes:
  * 
  *  * Dominoes, or 2 x 1 rectangles.
  *  * Trominoes, or L-shapes.
  * 
  * For example, if N = 4, here is one possible configuration, where A is a domino,
  * and B and C are trominoes.
  * 
  * A B B C
  * A B C C
  * 
  * 
  * Given an integer N, determine in how many ways this task is possible.
  */

object Problem312 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    