
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.
  * 
  * Do this faster than the naive method of repeated multiplication.
  * 
  * For example, pow(2, 10) should return 1024.
  */

object Problem61 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    