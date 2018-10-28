
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * Implement a stack API using only a heap. A stack implements the following
  * methods:
  * 
  *  * push(item), which adds an element to the stack
  *  * pop(), which removes and returns the most recently added element (or throws
  *    an error if there is nothing on the stack)
  * 
  * Recall that a heap has the following operations:
  * 
  *  * push(item), which adds a new key to the heap
  *  * pop(), which removes and returns the max value of the heap
  */

object Problem154 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    