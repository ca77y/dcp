
package pl.tom.algorithms.dailycode

/**
  * Given a function f, and N return a debounced f of N milliseconds.
  * 
  * That is, as long as the debounced f continues to be invoked, f itself will not be called for N milliseconds.
  */

object Problem105 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    