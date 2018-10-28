
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Given an iterator with methods next() and hasNext(), create a wrapper iterator, 
  * PeekableInterface, which also implements peek(). peek shows the next element
  * that would be returned on next().
  * 
  * Here is the interface:
  * 
  * class PeekableInterface(object):
  *     def __init__(self, iterator):
  *         pass
  * 
  *     def peek(self):
  *         pass
  * 
  *     def next(self):
  *         pass
  * 
  *     def hasNext(self):
  *         pass
  */

object Problem139 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    