
package pl.tom.algorithms.dailycode

/**
  * Find an efficient algorithm to find the smallest distance (measured in number of
  * words) between any two given words in a string.
  * 
  * For example, given words "hello", and "world" and a text content of "dog cat
  * hello cat dog dog hello cat world", return 1 because there's only one word "cat"
  * in between the two words.
  */

object Problem153 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    