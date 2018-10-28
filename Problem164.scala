
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * You are given an array of length n + 1 whose elements belong to the set {1, 2,
  * ..., n}. By the pigeonhole principle, there must be a duplicate. Find it in
  * linear time and space.
  */

object Problem164 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    