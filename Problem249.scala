
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Salesforce.
  * 
  * Given an array of integers, find the maximum XOR of any two elements.
  */

object Problem249 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    