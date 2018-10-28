
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a string, determine whether any permutation of it is a palindrome.
  * 
  * For example, carrace should return true, since it can be rearranged to form 
  * racecar, which is a palindrome. daily should return false, since there's no
  * rearrangement that can form a palindrome.
  */

object Problem157 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    