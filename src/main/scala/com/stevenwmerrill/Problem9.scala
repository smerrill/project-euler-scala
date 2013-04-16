package com.stevenwmerrill

/**
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

class Problem9 {
  def square(x:Long) = x * x
  def isPythagoreanTriple(a: Long, b: Long, c: Long): Boolean =  (a < b && b < c) && (a * a + b * b == c * c)
  def productOfTripleThatTotals(x: Long): Seq[Long] = {
    val i = 1L to x
    for (a <- i; b <- i; c <- i; if (isPythagoreanTriple(a, b, c) && (a + b + c == x)))
      yield (a * b * c)
  }

  println(productOfTripleThatTotals(1000).head)
}

object Problem9 {
  def main(args: Array[String]) {
    new Problem9
  }
}






