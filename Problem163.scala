
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Jane Street.
  * 
  * Given an arithmetic expression in Reverse Polish Notation
  * [http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwazm5j8luycj3n89fhYoThUWx3RRM00at2D-2BQbXgnmgtpYXuB6GN0SfL8FN6352M-2Fg-3D-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IvXvOZqsHTCsi0eVDN0sXSXkUMBdbraroGksIumf67q8lun9C-2FLJVMg13m-2BlsScevKwSN2iHy8WIge-2Bg1JZVILKLGzkfdC17ojL5olQLA81MgJ8NN5A2Yma0ckM1pMA8jx4scoCs6EUoyJyOBV8-2F4LOxIK1qUr9ADm-2BlBI6EgSGg-3D-3D], write a program to
  * evaluate it.
  * 
  * The expression is given as a list of numbers and operands. For example: [5, 3,
  * '+'] should return 5 + 3 = 8.
  * 
  * For example, [15, 7, 1, 1, '+', '-', '/', 3, '*', 2, 1, 1, '+', '+', '-'] should
  * return 5, since it is equivalent to ((15 / (7 - (1 + 1))) * 3) - (2 + (1 + 1)) =
  * 5.
  * 
  * You can assume the given expression is always valid.
  */

object Problem163 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    