
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * In a directed graph, each node is assigned an uppercase letter. We define a path's value as the number of most frequently-occurring letter along that path. For example, if a path in the graph goes through "ABACA", the value of the path is 3, since there are 3 occurrences of 'A' on the path.
  * 
  * Given a graph with n nodes and m directed edges, return the largest value path of the graph. If the largest value is infinite, then return null.
  * 
  * The graph is represented with a string and an edge list. The i-th character represents the uppercase letter of the i-th node. Each tuple in the edge list (i, j) means there is a directed edge from the i-th node to the j-th node. Self-edges are possible, as well as multi-edges.
  * 
  * For example, the following input graph:
  * 
  * Would have maximum value 3 using the path of vertices [0, 2, 3, 4], (A, A, C, A).
  * 
  * The following input graph:
  * 
  * Should return null, since we have an infinite loop.
  */

object Problem72 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    