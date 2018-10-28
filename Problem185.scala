
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given two rectangles on a 2D graph, return the area of their intersection. If
  * the rectangles don't intersect, return 0.
  * 
  * For example, given the following rectangles:
  * 
  * {
  *     "top_left": (1, 4),
  *     "dimensions": (3, 3) # width, height
  * }
  * 
  * 
  * and
  * 
  * {
  *     "top_left": (0, 5),
  *     "dimensions" (4, 3) # width, height
  * }
  * 
  * 
  * return 6.
  */

object Problem185 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    