
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by LinkedIn.
  * 
  * Given a list of points, a central point, and an integer k, find the nearest k 
  * points from the central point.
  * 
  * For example, given the list of points [(0, 0), (5, 4), (3, 1)], the central
  * point (1, 2), and k = 2, return[(0, 0), (3, 1)].
  */

object Problem150 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    