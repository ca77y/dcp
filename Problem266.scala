
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Pivotal.
  * 
  * A step word is formed by taking a given word, adding a letter, and anagramming
  * the result. For example, starting with the word "APPLE", you can add an "A" and
  * anagram to get "APPEAL".
  * 
  * Given a dictionary of words and an input word, create a function that returns
  * all valid step words.
  */

object Problem266 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    