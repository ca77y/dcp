
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Describe and give an example of each of the following types of polymorphism:
  * 
  *  * Ad-hoc polymorphism
  *  * Parametric polymorphism
  *  * Subtype polymorphism
  */

object Problem174 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    