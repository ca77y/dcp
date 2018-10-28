
package pl.tom.algorithms.dailycode

/**
  * Given a string and a set of characters, return the shortest substring containing all the characters in the set.
  * 
  * For example, given the string "figehaeci" and the set of characters {a, e, i}, you should return "aeci".
  * 
  * If there is no substring containing all the characters in the set, return null.
  */

object Problem103 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    