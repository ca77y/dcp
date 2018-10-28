
package pl.tom.algorithms.dailycode

/**
  * This question was asked by Riot Games.
  * 
  * Design and implement a HitCounter class that keeps track of requests (or hits).
  * It should support the following operations:
  * 
  *  * record(timestamp): records a hit that happened at timestamp
  *  * total(): returns the total number of hits recorded
  *  * range(lower, upper): returns the number of hits that occurred between
  *    timestamps lower and upper (inclusive)
  * 
  * Follow-up: What if our system has limited memory?
  */

object Problem132 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    