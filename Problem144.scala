
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given an array of numbers and an index i, return the index of the nearest larger
  * number of the number at index i, where distance is measured in array indices.
  * 
  * For example, given [4, 1, 3, 5, 6] and index 0, you should return 3.
  * 
  * If two distances to larger numbers are the equal, then return any one of them.
  * If the array at i doesn't have a nearest larger integer, then return null.
  * 
  * Follow-up: If you can preprocess the array, can you do this in constant time?
  */

object Problem144 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    