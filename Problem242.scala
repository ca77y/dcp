
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Twitter.
  * 
  * You are given an array of length 24, where each element represents the number of
  * new subscribers during the corresponding hour. Implement a data structure that
  * efficiently supports the following:
  * 
  *  * update(hour: int, value: int): Increment the element at index hour by value.
  *  * query(start: int, end: int): Retrieve the number of subscribers that have
  *    signed up between start and end (inclusive).
  * 
  * You can assume that all values get cleared at the end of the day, and that you
  * will not be asked for start and end values that wrap around midnight.
  */

object Problem242 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    