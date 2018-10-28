
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * What will this code print out?
  * 
  * def make_functions():
  *     flist = []
  * 
  *     for i in [1, 2, 3]:
  *         def print_i():
  *             print(i)
  *         flist.append(print_i)
  * 
  *     return flist
  * 
  * functions = make_functions()
  * for f in functions:
  *     f()
  * 
  * 
  * How can we make it print out what we apparently want?
  */

object Problem188 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    