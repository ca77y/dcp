
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Mozilla.
  * 
  * A bridge in a connected (undirected) graph is an edge that, if removed, causes
  * the graph to become disconnected. Find all the bridges in a graph.
  */

object Problem262 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    