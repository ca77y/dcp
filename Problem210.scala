
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Apple.
  * 
  * A Collatz sequence in mathematics can be defined as follows. Starting with any
  * positive integer:
  * 
  *  * if n is even, the next number in the sequence is n / 2
  *  * if n is odd, the next number in the sequence is 3n + 1 
  * 
  * It is conjectured that every such sequence eventually reaches the number 1. Test
  * this conjecture.
  * 
  * Bonus: what input n <= 1000000 gives the longest sequence?
  */

object Problem210 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    