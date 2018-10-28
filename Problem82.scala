
package pl.tom.algorithms.dailycode

/**
  * Using a read7() method that returns 7 characters from a file, implement readN(n) which reads n characters.
  * 
  * For example, given a file with the content “Hello world”, three read7() returns “Hello w”, “orld” and then “”.
  */

object Problem82 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    