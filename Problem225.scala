
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Bloomberg.
  * 
  * There are N prisoners standing in a circle, waiting to be executed. The
  * executions are carried out starting with the kth person, and removing every
  * successive kth person going clockwise until there is no one left.
  * 
  * Given N and k, write an algorithm to determine where a prisoner should stand in
  * order to be the last survivor.
  * 
  * For example, if N = 5 and k = 2, the order of executions would be [2, 4, 1, 5,
  * 3], so you should return 3.
  * 
  * Bonus: Find an O(log N) solution if k = 2.
  */

object Problem225 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    