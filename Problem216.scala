
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Facebook.
  * 
  * Given a number in Roman numeral [https://en.wikipedia.org/wiki/Roman_numerals] 
  * format, convert it to decimal.
  * 
  * The values of Roman numerals are as follows:
  * 
  * {
  *     'M': 1000,
  *     'D': 500,
  *     'C': 100,
  *     'L': 50,
  *     'X': 10,
  *     'V': 5,
  *     'I': 1
  * }
  * 
  * 
  * In addition, note that the Roman numeral system uses subtractive notation
  * [https://en.wikipedia.org/wiki/Subtractive_notation] for numbers such as IV and 
  * XL.
  * 
  * For the input XIV, for instance, you should return 14.
  */

object Problem216 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    