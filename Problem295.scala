
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Stitch Fix.
  * 
  * Pascal's triangle is a triangular array of integers constructed with the
  * following formula:
  * 
  *  * The first row consists of the number 1.
  *  * For each subsequent row, each element is the sum of the numbers directly
  *    above it, on either side.
  * 
  * For example, here are the first few rows:
  * 
  *     1
  *    1 1
  *   1 2 1
  *  1 3 3 1
  * 1 4 6 4 1
  * 
  * 
  * Given an input k, return the kth row of Pascal's triangle.
  * 
  * Bonus: Can you do this using only O(k) space?
  */

object Problem295 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    