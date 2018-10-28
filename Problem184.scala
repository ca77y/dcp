
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given n numbers, find the greatest common denominator between them.
  * 
  * For example, given the numbers [42, 56, 14], return 14.
  */

object Problem184 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    