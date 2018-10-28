
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Palantir.
  * 
  * You are given a list of N numbers, in which each number is located at most k 
  * places away from its sorted position. For example, if k = 1, a given element at
  * index 4 might end up at indices 3, 4, or 5.
  * 
  * Come up with an algorithm that sorts this list in O(N log k) time.
  */

object Problem306 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    