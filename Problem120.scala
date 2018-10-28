
package pl.tom.algorithms.dailycode

/**
  * and in every odd call of <code>getInstance()</code>, return the second instance.</p>
  */

object Problem120 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    