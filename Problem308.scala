
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Quantcast.
  * 
  * You are presented with an array representing a Boolean expression. The elements
  * are of two kinds:
  * 
  *  * T and F, representing the values True and False.
  *  * &, |, and ^, representing the bitwise operators for AND, OR, and XOR.
  * 
  * Determine the number of ways to group the array elements using parentheses so
  * that the entire expression evaluates to True.
  * 
  * For example, suppose the input is ['F', '|', 'T', '&', 'T']. In this case, there
  * are two acceptable groupings: (F | T) & T and F | (T & T).
  */

object Problem308 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    