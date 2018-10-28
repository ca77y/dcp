
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * A number is considered perfect if its digits sum up to exactly 10.
  * 
  * Given a positive integer n, return the n-th perfect number.
  * 
  * For example, given 1, you should return 19. Given 2, you should return 28.
  */

object Problem70 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    