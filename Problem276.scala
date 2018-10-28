
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Dropbox.
  * 
  * Implement an efficient string matching algorithm.
  * 
  * That is, given a string of length N and a pattern of length k, write a program
  * that searches for the pattern in the string with less than O(N * k) worst-case
  * time complexity.
  * 
  * If the pattern is found, return the start index of its location. If not, return 
  * False.
  */

object Problem276 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    