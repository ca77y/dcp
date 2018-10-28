
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by LinkedIn.
  * 
  * Given a set of characters C and an integer k, a De Bruijn sequence is a cyclic
  * sequence in which every possible k-length string of characters in C occurs
  * exactly once.
  * 
  * For example, suppose C = {0, 1} and k = 3. Then our sequence should contain the
  * substrings {'000', '001', '010', '011', '100', '101', '110', '111'}, and one
  * possible solution would be 00010111.
  * 
  * Create an algorithm that finds a De Bruijn sequence.
  */

object Problem264 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    