
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Jane Street.
  * 
  * The United States uses the imperial system of weights and measures, which means
  * that there are many different, seemingly arbitrary units to measure distance.
  * There are 12 inches in a foot, 3 feet in a yard, 22 yards in a chain, and so on
  * [https://en.wikipedia.org/wiki/Imperial_units#Length].
  * 
  * Create a data structure that can efficiently convert a certain quantity of one
  * unit to the correct amount of any other unit. You should also allow for
  * additional units to be added to the system.
  */

object Problem325 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    