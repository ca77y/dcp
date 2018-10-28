
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * In chess, the Elo rating system is used to calculate player strengths based on
  * game results.
  * 
  * A simplified description of the Elo system is as follows. Every player begins at
  * the same score. For each subsequent game, the loser transfers some points to the
  * winner, where the amount of points transferred depends on how unlikely the win
  * is. For example, a 1200-ranked player should gain much more points for beating a
  * 2000-ranked player than for beating a 1300-ranked player.
  * 
  * Implement this system.
  */

object Problem328 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    