
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Pandora.
  * 
  * Given an undirected graph, determine if it contains a cycle.
  */

object Problem280 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    