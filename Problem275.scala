
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Epic.
  * 
  * The "look and say" sequence is defined as follows: beginning with the term 1,
  * each subsequent term visually describes the digits appearing in the previous
  * term. The first few terms are as follows:
  * 
  * 1
  * 11
  * 21
  * 1211
  * 111221
  * 
  * 
  * As an example, the fourth term is 1211, since the third term consists of one 2 
  * and one 1.
  * 
  * Given an integer N, print the Nth term of this sequence.
  */

object Problem275 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    