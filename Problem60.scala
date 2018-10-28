
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a set of integers, return whether the set can be partitioned into two subsets whose sums are the same.
  * 
  * For example, given the set {15, 5, 20, 10, 35, 25}, it would return true, since we can split the set up into {15, 5, 10, 15} and {20, 35}, which both add up to 55.
  * 
  * Given the set {15, 5, 20, 10, 35}, it would return false, since we can't split the set up into two subsets that add up to the same sum.
  */

object Problem60 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    