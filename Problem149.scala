
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Goldman Sachs.
  * 
  * Given a list of numbers L, implement a method sum(i, j) which returns the sum
  * from the sublist L[i:j] (including i, excluding j).
  * 
  * For example, given L = [1, 2, 3, 4, 5], sum(1, 3) should return sum([2, 3]),
  * which is 5.
  * 
  * You can assume that you can do some pre-processing. sum() should be optimized
  * over the pre-processing step.
  */

object Problem149 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    