
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Dropbox.
  * 
  * Given a string s and a list of words words, where each word is the same length,
  * find all starting indices of substrings in sthat is a concatenation of every
  * word in words exactly once.
  * 
  * For example, given s = "dogcatcatcodecatdog" and words = ["cat", "dog"], return
  * [0, 13], since "dogcat" starts at index 0 and "catdog" starts at index 13.
  * 
  * Given s = "barfoobazbitbyte" and words = ["dog", "cat"], return [] since there
  * are no substrings composed of "dog" and "cat" in s.
  * 
  * The order of the indices does not matter.
  */

object Problem172 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    