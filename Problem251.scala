
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given an array of a million integers between zero and a billion, out of order,
  * how can you efficiently sort it? Assume that you cannot store an array of a
  * billion elements in memory.
  */

object Problem251 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    