
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Let M be an N by N matrix in which every row and every column is sorted. No two
  * elements of M are equal.
  * 
  * Given i1, j1, i2, and k2, compute the number of elements of M smaller than M[i1,
  * j1] and larger than M[i2, j2].
  */

object Problem195 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    