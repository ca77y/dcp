
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Glassdoor.
  * 
  * An imminent hurricane threatens the coastal town of Codeville. If at most two
  * people can fit in a rescue boat, and the maximum weight limit for a given boat
  * is k, determine how many boats will be needed to save everyone.
  * 
  * For example, given a population with weights [100, 200, 150, 80] and a boat
  * limit of 200, the smallest number of boats required will be three.
  */

object Problem291 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    