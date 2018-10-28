
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Recall that the minimum spanning tree is the subset of edges of a tree that
  * connect all its vertices with the smallest possible total edge weight. Given an
  * undirected graph with weighted edges, compute the maximum weight spanning tree.
  */

object Problem234 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    