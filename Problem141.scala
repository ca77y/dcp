
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Microsoft.
  * 
  * Implement 3 stacks using a single list:
  * 
  * class Stack:
  *     def __init__(self):
  *         self.list = []
  * 
  *     def pop(self, stack_number):
  *         pass
  * 
  *     def push(self, item, stack_number):
  *         pass
  */

object Problem141 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    