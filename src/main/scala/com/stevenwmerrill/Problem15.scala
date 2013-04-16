package com.stevenwmerrill

/**
 */
class Problem15 {
  implicit def intToBigInt(n: Int) = BigInt(n)
  def factorial(x: BigInt): BigInt = (1 to x).reduceLeft(_ * _)
  def paths(x: BigInt): BigInt = factorial(2 * x) / (factorial(x) * factorial(x))
  println(paths(20))
}

object Problem15 {
  def main(args: Array[String]) {
    new Problem15
  }
}
