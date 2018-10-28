
package pl.tom.algorithms.dailycode

/**
  * What does the below code snippet print out? How can we fix the anonymous functions to behave as we'd expect?
  */

object Problem91 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    