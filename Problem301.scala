
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Triplebyte.
  * 
  * Implement a data structure which carries out the following operations without
  * resizing the underlying array:
  * 
  *  * add(value): Add a value to the set of values.
  *  * check(value): Check whether a value is in the set.
  * 
  * The check method may return occasional false positives (in other words,
  * incorrectly identifying an element as part of the set), but should always
  * correctly identify a true element.
  */

object Problem301 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    