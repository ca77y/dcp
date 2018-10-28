
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that can be removed to ensure that each row is ordered from top to bottom lexicographically. That is, the letter at each column is lexicographically later as you go down each row. It does not matter whether each row itself is ordered lexicographically.
  * 
  * For example, given the following table:
  * 
  * This is not ordered because of the a in the center. We can remove the second column to make it ordered:
  * 
  * So your function should return 1, since we only needed to remove 1 column.
  * 
  * As another example, given the following table:
  * 
  * Your function should return 0, since the rows are already ordered (there's only one row).
  * 
  * As another example, given the following table:
  * 
  * Your function should return 3, since we would need to remove all the columns to order it.
  */

object Problem76 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    