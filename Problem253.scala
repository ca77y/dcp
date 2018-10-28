
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by PayPal.
  * 
  * Given a string and a number of lines k, print the string in zigzag form. In
  * zigzag, characters are printed out diagonally from top left to bottom right
  * until reaching the kth line, then back up to top right, and so on. 
  * 
  * For example, given the sentence "thisisazigzag" and k = 4, you should print:
  * 
  * t     a     g
  *  h   s z   a
  *   i i   i z
  *    s     g
  */

object Problem253 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    