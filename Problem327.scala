
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Salesforce.
  * 
  * Write a program to merge two binary trees. Each node in the new tree should hold
  * a value equal to the sum of the values of the corresponding nodes of the input
  * trees. 
  * 
  * If only one input tree has a node in a given position, the corresponding node in
  * the new tree should match that input node.
  */

object Problem327 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    