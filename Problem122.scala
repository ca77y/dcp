
package pl.tom.algorithms.dailycode

/**
  * You are given a 2-d matrix where each cell represents number of coins in that cell. Assuming we start at matrix[0][0], and can only move right or down, find the maximum number of coins you can collect by the bottom right corner.
  * 
  * For example, in this matrix
  * 
  * The most we can collect is 0 + 2 + 1 + 5 + 3 + 1 = 12 coins.
  */

object Problem122 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    