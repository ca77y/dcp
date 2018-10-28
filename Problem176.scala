
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Bloomberg.
  * 
  * Determine whether there exists a one-to-one character mapping from one string s1 
  * to another s2.
  * 
  * For example, given s1 = abc and s2 = bcd, return true since we can map a to b, b 
  * to c, and c to d.
  * 
  * Given s1 = foo and s2 = bar, return false since the o cannot map to two
  * characters.
  */

object Problem176 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    