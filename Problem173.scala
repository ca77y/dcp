
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Stripe.
  * 
  * Write a function to flatten a nested dictionary. Namespace the keys with a
  * period.
  * 
  * For example, given the following dictionary:
  * 
  * {
  *     "key": 3,
  *     "foo": {
  *         "a": 5,
  *         "bar": {
  *             "baz": 8
  *         }
  *     }
  * }
  * 
  * 
  * it should become:
  * 
  * {
  *     "key": 3,
  *     "foo.a": 5,
  *     "foo.bar.baz": 8
  * }
  * 
  * 
  * You can assume keys do not contain dots in them, i.e. no clobbering will occur.
  */

object Problem173 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    