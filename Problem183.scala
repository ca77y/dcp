
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Twitch.
  * 
  * Describe what happens when you type a URL into your browser and press Enter.
  */

object Problem183 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    