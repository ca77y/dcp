
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Spotify.
  * 
  * Write a function, throw_dice(N, faces, total), that determines how many ways it
  * is possible to throw N dice with some number of faces each to get a specific
  * total.
  * 
  * For example, throw_dice(3, 6, 7) should equal 15.
  */

object Problem272 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    