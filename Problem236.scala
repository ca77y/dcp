
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Nvidia.
  * 
  * You are given a list of N points (x1, y1), (x2, y2), ..., (xN, yN) representing
  * a polygon. You can assume these points are given in order; that is, you can
  * construct the polygon by connecting point 1 to point 2, point 2 to point 3, and
  * so on, finally looping around to connect point N to point 1.
  * 
  * Determine if a new point p lies inside this polygon. (If p is on the boundary of
  * the polygon, you should return False).
  */

object Problem236 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    