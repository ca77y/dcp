
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * You have a large array with most of the elements as zero.
  * 
  * Use a more space-efficient data structure, SparseArray, that implements the same
  * interface:
  * 
  *  * init(arr, size): initialize with the original large array and size.
  *  * set(i, val): updates index at i with val.
  *  * get(i): gets the value at index i.
  */

object Problem134 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    