
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Netflix.
  * 
  * A Cartesian tree with sequence S is a binary tree defined by the following two
  * properties:
  * 
  *  * It is heap-ordered, so that each parent value is strictly less than that of
  *    its children.
  *  * An in-order traversal of the tree produces nodes with values that correspond
  *    exactly to S.
  * 
  * For example, given the sequence [3, 2, 6, 1, 9], the resulting Cartesian tree
  * would be:
  * 
  *       1
  *     /   \   
  *   2       9
  *  / \
  * 3   6
  * 
  * 
  * Given a sequence S, construct the corresponding Cartesian tree.
  */

object Problem326 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    