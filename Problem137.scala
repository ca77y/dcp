
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Implement a bit array.
  * 
  * A bit array is a space efficient array that holds a value of 1 or 0 at each
  * index.
  * 
  *  * init(size): initialize the array with size
  *  * set(i, val): updates index at i with val where val is either 1 or 0.
  *  * get(i): gets the value at index i.
  */

object Problem137 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    