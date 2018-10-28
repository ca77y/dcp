
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Stripe.
  * 
  * Given an integer n, return the length of the longest consecutive run of 1s in
  * its binary representation.
  * 
  * For example, given 156, you should return 3.
  */

object Problem214 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    