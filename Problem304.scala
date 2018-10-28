
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Two Sigma.
  * 
  * A knight is placed on a given square on an 8 x 8 chessboard. It is then moved
  * randomly several times, where each move is a standard knight move
  * [https://en.wikipedia.org/wiki/Knight_(chess)#Movement]. If the knight jumps off
  * the board at any point, however, it is not allowed to jump back on.
  * 
  * After k moves, what is the probability that the knight remains on the board?
  */

object Problem304 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    