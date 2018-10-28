
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Sumo Logic.
  * 
  * Given an unsorted array, in which all elements are distinct, find a "peak"
  * element in O(log N) time.
  * 
  * An element is considered a peak if it is greater than both its left and right
  * neighbors. It is guaranteed that the first and last elements are lower than all
  * others.
  */

object Problem311 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    