package com.stevenwmerrill

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1 {
  println((1 to 999).filter(multipleOfThreeOrFive(_)).sum)
  def multipleOf(divisor: Int)(num: Int): Boolean = num % divisor == 0
  def multipleOfThreeOrFive(num: Int) = multipleOf(3)(num) || multipleOf(5)(num)
}

object Problem1 {
  def main(args: Array[String]) {
    new Problem1
  }
}
