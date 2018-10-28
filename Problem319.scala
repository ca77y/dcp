
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Airbnb.
  * 
  * An 8-puzzle is a game played on a 3 x 3 board of tiles, with the ninth tile
  * missing. The remaining tiles are labeled 1 through 8 but shuffled randomly.
  * Tiles may slide horizontally or vertically into an empty space, but may not be
  * removed from the board.
  * 
  * Design a class to represent the board, and find a series of steps to bring the
  * board to the state [[1, 2, 3], [4, 5, 6], [7, 8, None]].
  */

object Problem319 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    