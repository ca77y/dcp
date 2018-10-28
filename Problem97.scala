
package pl.tom.algorithms.dailycode

/**
  * Write a map implementation with a get function that lets you retrieve the value of a key at a particular time.
  * 
  * It should contain the following methods:
  * 
  * The map should work like this. If we set a key at a particular time, it will maintain that value forever or until it gets set at a later time. In other words, when we get a key at a time, it should return the value that was set for that key set at the most recent time.
  * 
  * Consider the following examples:
  */

object Problem97 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    