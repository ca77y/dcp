
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Spotify.
  * 
  * There are N couples sitting in a row of length 2 * N. They are currently ordered
  * randomly, but would like to rearrange themselves so that each couple's partners
  * can sit side by side.
  * 
  * What is the minimum number of swaps necessary for this to happen?
  */

object Problem240 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    