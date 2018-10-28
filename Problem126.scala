
package pl.tom.algorithms.dailycode

/**
  * Write a function that rotates a list by k elements. For example, [1, 2, 3, 4, 5,
  * 6] rotated by two becomes [3, 4, 5, 6, 1, 2]. Try solving this without creating
  * a copy of the list. How many swap or move operations do you need?
  */

object Problem126 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    