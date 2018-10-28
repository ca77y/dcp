
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by YouTube.
  * 
  * Write a program that computes the length of the longest common subsequence of
  * three given strings. For example, given "epidemiologist", "refrigeration", and
  * "supercalifragilisticexpialodocious", it should return 5, since the longest
  * common subsequence is "eieio".
  */

object Problem209 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    