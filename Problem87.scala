
package pl.tom.algorithms.dailycode

/**
  * A rule looks like this:
  * 
  * A NE B
  * 
  * This means this means point A is located northeast of point B.
  * 
  * A SW C
  * 
  * means that point A is southwest of C.
  * 
  * Given a list of rules, check if the sum of the rules validate. For example:
  * 
  * does not validate, since A cannot be both north and south of C.
  * 
  * is considered valid.
  */

object Problem87 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    