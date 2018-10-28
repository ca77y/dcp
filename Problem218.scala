
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Yahoo.
  * 
  * Write an algorithm that computes the reversal of a directed graph. For example,
  * if a graph consists of A -> B -> C, it should become A <- B <- C.
  */

object Problem218 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    