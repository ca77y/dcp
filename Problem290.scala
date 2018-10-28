
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * On a mysterious island there are creatures known as Quxes which come in three
  * colors: red, green, and blue. One power of the Qux is that if two of them are
  * standing next to each other, they can transform into a single creature of the
  * third color.
  * 
  * Given N Quxes standing in a line, determine the smallest number of them
  * remaining after any possible sequence of such transformations.
  * 
  * For example, given the input ['R', 'G', 'B', 'G', 'B'], it is possible to end up
  * with a single Qux through the following steps:
  * 
  *         Arrangement       |   Change
  * ----------------------------------------
  * ['R', 'G', 'B', 'G', 'B'] | (R, G) -> B
  * ['B', 'B', 'G', 'B']      | (B, G) -> R
  * ['B', 'R', 'B']           | (R, B) -> G
  * ['B', 'G']                | (B, G) -> R
  * ['R']                     |
  */

object Problem290 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    