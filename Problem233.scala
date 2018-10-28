
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Apple.
  * 
  * Implement the function fib(n), which returns the nth number in the Fibonacci
  * sequence, using only O(1) space.
  */

object Problem233 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    