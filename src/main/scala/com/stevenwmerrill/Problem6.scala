package com.stevenwmerrill

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

class Problem6 {
  def square(i: Int) = i * i
  def sumOfSquares(i: Range) = i.map(square).sum
  def squareOfSums(i: Range) = square(i.sum)
  def difference(i: Range) = squareOfSums(i) - sumOfSquares(i)

  println(difference(1 to 10))
  println(difference(1 to 100))
}

object Problem6 {
  def main(args: Array[String]) {
    new Problem6
  }
}



