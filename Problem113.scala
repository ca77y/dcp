
package pl.tom.algorithms.dailycode

/**
  * Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"
  * 
  * Follow-up: given a mutable string representation, can you perform this operation in-place?
  */

object Problem113 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    