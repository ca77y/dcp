
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Square.
  * 
  * In front of you is a row of N coins, with values v1, v1, ..., vn.
  * 
  * You are asked to play the following game. You and an opponent take turns
  * choosing either the first or last coin from the row, removing it from the row,
  * and receiving the value of the coin.
  * 
  * Write a program that returns the maximum amount of money you can win with
  * certainty, if you move first, assuming your opponent plays optimally.
  */

object Problem220 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    