
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Netflix.
  * 
  * Given a sorted list of integers of length N, determine if an element x is in the
  * list without performing any multiplication, division, or bit-shift operations.
  * 
  * Do this in O(log N) time.
  */

object Problem271 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    