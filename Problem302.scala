
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Uber.
  * 
  * You are given a 2-d matrix where each cell consists of either /, \, or an empty
  * space. Write an algorithm that determines into how many regions the slashes
  * divide the space.
  * 
  * For example, suppose the input for a three-by-six grid is the following:
  * 
  * \    /
  *  \  /
  *   \/
  * 
  * 
  * Considering the edges of the matrix as boundaries, this divides the grid into
  * three triangles, so you should return 3.
  */

object Problem302 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    