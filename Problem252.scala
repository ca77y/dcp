
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Palantir.
  * 
  * The ancient Egyptians used to express fractions as a sum of several terms where
  * each numerator is one. For example, 4 / 13 can be represented as 1 / 4 + 1 / 18
  * + 1 / 468.
  * 
  * Create an algorithm to turn an ordinary fraction a / b, where a < b, into an
  * Egyptian fraction.
  */

object Problem252 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    