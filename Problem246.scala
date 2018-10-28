
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Dropbox.
  * 
  * Given a list of words, determine whether the words can be chained to form a
  * circle. A word X can be placed in front of another word Y in a circle if the
  * last character of X is same as the first character of Y.
  * 
  * For example, the words ['chair', 'height', 'racket', touch', 'tunic'] can form
  * the following circle: chair --> racket --> touch --> height --> tunic --> chair.
  */

object Problem246 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    