
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Apple.
  * 
  * You are going on a road trip, and would like to create a suitable music
  * playlist. The trip will require N songs, though you only have M songs
  * downloaded, where M < N. A valid playlist should select each song at least once,
  * and guarantee a buffer of B songs between repeats.
  * 
  * Given N, M, and B, determine the number of valid playlists.
  */

object Problem318 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    