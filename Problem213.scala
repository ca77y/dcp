
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Snapchat.
  * 
  * Given a string of digits, generate all possible valid IP address combinations.
  * 
  * IP addresses must follow the format A.B.C.D, where A, B, C, and D are numbers
  * between 0 and 255. Zero-prefixed numbers, such as 01 and 065, are not allowed,
  * except for 0 itself.
  * 
  * For example, given "2542540123", you should return ['254.25.40.123',
  * '254.254.0.123'].
  */

object Problem213 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    