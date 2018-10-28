
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
  * 
  * For example, given the following matrix:
  * 
  * You should print out the following:
  */

object Problem65 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    