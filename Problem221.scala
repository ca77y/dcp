
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Zillow.
  * 
  * Let's define a "sevenish" number to be one which is either a power of 7, or the
  * sum of unique powers of 7. The first few sevenish numbers are 1, 7, 8, 49, and
  * so on. Create an algorithm to find the nth sevenish number.
  */

object Problem221 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    