
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Spotify.
  * 
  * You are the technical director of WSPT radio, serving listeners nationwide. For
  * simplicity's sake we can consider each listener to live along a horizontal line
  * stretching from 0 (west) to 1000 (east).
  * 
  * Given a list of N listeners, and a list of M radio towers, each placed at
  * various locations along this line, determine what the minimum broadcast range
  * would have to be in order for each listener's home to be covered.
  * 
  * For example, suppose listeners = [1, 5, 11, 20], and towers = [4, 8, 15]. In
  * this case the minimum range would be 5, since that would be required for the
  * tower at position 15 to reach the listener at position 20.
  */

object Problem314 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    