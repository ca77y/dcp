
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Apple.
  * 
  * A fixed point in an array is an element whose value is equal to its index. Given
  * a sorted array of distinct elements, return a fixed point, if one exists.
  * Otherwise, return False. 
  * 
  * For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you
  * should return False.
  */

object Problem273 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    