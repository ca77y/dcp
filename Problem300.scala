
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Uber.
  * 
  * On election day, a voting machine writes data in the form (voter_id,
  * candidate_id) to a text file. Write a program that reads this file as a stream
  * and returns the top 3 candidates at any given time. If you find a voter voting
  * more than once, report this as fraud.
  */

object Problem300 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    