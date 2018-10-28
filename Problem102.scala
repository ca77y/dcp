
package pl.tom.algorithms.dailycode

/**
  * Given a list of integers and a number K, return which contiguous elements of the list sum to K.
  * 
  * For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4].
  */

object Problem102 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    