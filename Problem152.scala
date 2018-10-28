
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Triplebyte.
  * 
  * You are given n numbers as well as n probabilities that sum up to 1. Write a
  * function to generate one of the numbers with its corresponding probability.
  * 
  * For example, given the numbers [1, 2, 3, 4] and probabilities [0.1, 0.5, 0.2,
  * 0.2], your function should return 1 10% of the time, 2 50% of the time, and 3
  * and 4 20% of the time.
  * 
  * You can generate random numbers between 0 and 1 uniformly.
  */

object Problem152 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    