
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Dropbox.
  * 
  * Spreadsheets often use this alphabetical encoding for its columns: "A", "B",
  * "C", ..., "AA", "AB", ..., "ZZ", "AAA", "AAB", ....
  * 
  * Given a column number, return its alphabetical column id. For example, given 1,
  * return "A". Given 27, return "AA".
  */

object Problem212 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    