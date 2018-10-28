
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Airbnb.
  * 
  * Given a list of words, find all pairs of unique indices such that the
  * concatenation of the two words is a palindrome.
  * 
  * For example, given the list ["code", "edoc", "da", "d"], return [(0, 1), (1, 0),
  * (2, 3)].
  */

object Problem167 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    