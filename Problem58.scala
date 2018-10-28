
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * An sorted array of integers was rotated an unknown number of times.
  * 
  * Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.
  * 
  * For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).
  * 
  * You can assume all the integers in the array are unique.
  */

object Problem58 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    