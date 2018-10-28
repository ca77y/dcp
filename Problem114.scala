
package pl.tom.algorithms.dailycode

/**
  * Follow-up: Does your solution work for the following cases: "hello/world:here/", "hello//world:here"
  */

object Problem114 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    