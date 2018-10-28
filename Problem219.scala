
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Salesforce.
  * 
  * Connect 4 is a game where opponents take turns dropping red or black discs into
  * a 7 x 6 vertically suspended grid. The game ends either when one player creates
  * a line of four consecutive discs of their color (horizontally, vertically, or
  * diagonally), or when there are no more spots left in the grid.
  * 
  * Design and implement Connect 4.
  */

object Problem219 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    