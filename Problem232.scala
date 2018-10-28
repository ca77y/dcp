
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Google.
  * 
  * Implement a PrefixMapSum class with the following methods:
  * 
  *  * insert(key: str, value: int): Set a given key's value in the map. If the key
  *    already exists, overwrite the value.
  *  * sum(prefix: str): Return the sum of all values of keys that begin with a
  *    given prefix.
  * 
  * For example, you should be able to run the following code:
  * 
  * mapsum.insert("columnar", 3)
  * assert mapsum.sum("col") == 3
  * 
  * mapsum.insert("column", 2)
  * assert mapsum.sum("col") == 5
  */

object Problem232 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    