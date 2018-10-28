
package pl.tom.algorithms.dailycode

/**
  * Given an even number (greater than 2), return two prime numbers whose sum will be equal to the given number.
  * 
  * A solution will always exist. See Goldbach’s conjecture.
  * 
  * Example:
  * 
  * If there are more than one solution possible, return the lexicographically smaller solution.
  * 
  * If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, then
  * 
  * If a < c OR a==c AND b < d.
  */

object Problem101 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    