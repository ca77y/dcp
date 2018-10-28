
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a linked list, remove all consecutive nodes that sum to zero. Print out
  * the remaining nodes.
  * 
  * For example, suppose you are given the input 3 -> 4 -> -7 -> 5 -> -6 -> 6. In
  * this case, you should first remove 3 -> 4 -> -7, then -6 -> 6, leaving only 5.
  */

object Problem305 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    