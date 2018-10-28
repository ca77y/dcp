
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a sorted array, find the smallest positive integer that is not the sum of
  * a subset of the array.
  * 
  * For example, for the input [1, 2, 3, 10], you should return 7.
  * 
  * Do this in O(N) time.
  */

object Problem224 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    