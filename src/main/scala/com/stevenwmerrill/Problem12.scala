package com.stevenwmerrill

/**
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * Let us list the factors of the first seven triangle numbers:
 *
 *  1: 1
 *  3: 1,3
 *  6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 *
 * What is the value of the first triangle number to have over five hundred divisors?
 */
class Problem12 {
  def divisors(x: Long): List[Long] = (1L to math.sqrt(x).toLong).filter(x % _ == 0).toList.flatMap(y => List(y, x / y)).sorted
  def triangleNumber(x: Long) = (1L to x).foldLeft(0L)(_ + _)
  def triangleNumbers(start: Long = 1L): Stream[Long] = Stream.cons(triangleNumber(start), triangleNumbers(start + 1))

  println(triangleNumbers(1).dropWhile(divisors(_).length <= 500).head)
}

object Problem12 {
  def main(args: Array[String]) {
    new Problem12
  }
}
