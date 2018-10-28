
package pl.tom.algorithms.dailycode

/**
  * Given a 2-D matrix representing an image, a location of a pixel in the screen
  * and a color C, replace the color of the given pixel and all adjacent same
  * colored pixels with C.
  * 
  * For example, given the following matrix, and location pixel of (2, 2), and 'G'
  * for green:
  * 
  * B B W
  * W W W
  * W W W
  * B B B
  * 
  * 
  * Becomes
  * 
  * B B G
  * G G G
  * G G G
  * B B B
  */

object Problem151 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    