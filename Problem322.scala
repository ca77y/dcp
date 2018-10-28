
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Flipkart.
  * 
  * Starting from 0 on a number line, you would like to make a series of jumps that
  * lead to the integer N.
  * 
  * On the ith jump, you may move exactly i places to the left or right.
  * 
  * Find a path with the fewest number of jumps required to get from 0 to N.
  */

object Problem322 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    