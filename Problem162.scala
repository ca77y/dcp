
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Square.
  * 
  * Given a list of words, return the shortest unique prefix of each word. For
  * example, given the list:
  * 
  *  * dog
  *  * cat
  *  * apple
  *  * apricot
  *  * fish
  * 
  * Return the list:
  * 
  *  * d
  *  * c
  *  * app
  *  * apr
  *  * f
  */

object Problem162 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    