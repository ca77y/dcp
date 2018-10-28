
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Given a pivot x, and a list lst, partition the list into three parts.
  * 
  *  * The first part contains all elemenets in lst that are less than x
  *  * The first part contains all elemenets in lst that are equal to x
  *  * The first part contains all elemenets in lst that are larger than x
  * 
  * Ordering within a part can be arbitrary.
  * 
  * For example, given x = 10 and lst = [9, 12, 3, 5, 14, 10, 10], one partition may
  * be `[9, 3, 5, 10, 10, 12, 14]
  */

object Problem143 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    