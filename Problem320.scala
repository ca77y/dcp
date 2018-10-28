
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a string, find the length of the smallest window that contains every
  * distinct character. Characters may appear more than once in the window.
  * 
  * For example, given "jiujitsu", you should return 5, corresponding to the final
  * five letters.
  */

object Problem320 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    