
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Suppose you are given two lists of n points, one list p1, p2, ..., pnon the line
  * y = 0 and the other list q1, q2, ..., qn on the line y = 1. Imagine a set of n 
  * line segments connecting each point pi to qi. Write an algorithm to determine
  * how many pairs of the line segments intersect.
  */

object Problem194 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    