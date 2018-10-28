
package pl.tom.algorithms.dailycode

/**
  * This problem was asked by Amazon.
  * 
  * You are given a list of data entries that represent entries and exits of groups
  * of people into a building. An entry looks like this:
  * 
  * {"timestamp": 1526579928, count: 3, "type": "enter"}
  * 
  * This means 3 people entered the building. An exit looks like this:
  * 
  * {"timestamp": 1526580382, count: 2, "type": "exit"}
  * 
  * This means that 2 people exited the building. timestamp is in Unix time
  * [http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwazm5j8luycj3n89fhYoThVy34-2BelwYhYZS9Ssd0b5uy_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1Kbt-2F7HVe-2Fwv4hfqLDN8Vr1VBU6ykJ9lEP1KoWOjng8G8Yb8ahxz6C52sNwjBxpBne5z6HSJoES9qCfy4gfsQpQF5-2FNZAUmX48B9PfPqNTD-2Bm-2FeXKxZtOM58-2FWKS-2Ba4-2Fc93bVzblOjnCmcyYsK90HUpxFsC-2FKlbR5sG8YofbhVNIw-3D-3D].
  * 
  * Find the busiest period in the building, that is, the time with the most people
  * in the building. Return it as a pair of (start, end) timestamps. You can assume
  * the building always starts off and ends up empty, i.e. with 0 people inside.
  */

object Problem171 {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    