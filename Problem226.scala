
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Airbnb.
  * 
  * You come across a dictionary of sorted words in a language you've never seen
  * before. Write a program that returns the correct order of letters in this
  * language.
  * 
  * For example, given ['xww', 'wxyz', 'wxyw', 'ywx', 'ywz'], you should return 
  * ['x', 'z', 'w', 'y'].
  */

object Problem226 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    