
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * On our special chessboard, two bishops attack each other if they share the same diagonal. This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.
  * 
  * You are given N bishops, represented as (row, column) tuples on a M by M chessboard. Write a function to count the number of pairs of bishops that attack each other. The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).
  * 
  * For example, given M = 5 and the list of bishops:
  * 
  * The board would look like this:
  * 
  * You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.
  */

object Problem68 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    