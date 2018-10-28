
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given an array and a number k that's smaller than the length of the array,
  * rotate the array to the right k elements in-place.
  */

object Problem197 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    