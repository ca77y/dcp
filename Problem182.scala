
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * A graph is minimally-connected if it is connected and there is no edge that can
  * be removed while still leaving the graph connected. For example, any binary tree
  * is minimally-connected.
  * 
  * Given an undirected graph, check if the graph is minimally-connected. You can
  * choose to represent the graph as either an adjacency matrix or adjacency list.
  */

object Problem182 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    