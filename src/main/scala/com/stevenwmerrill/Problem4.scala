package com.stevenwmerrill

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

class Problem4 {
  val threeDigitProducts: Seq[Int] = (for (x <- 1 to 999; y <- 1 to 999) yield x * y)
  def isPalindrome(x: Int): Boolean = x.toString.reverse == x.toString
  println(threeDigitProducts.filter(isPalindrome).max)
}

object Problem4 {
  def main(args: Array[String]) {
    new Problem4
  }
}