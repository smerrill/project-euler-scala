package com.stevenwmerrill

/**
 */
object Problem15 extends App {
  implicit def intToBigInt(n: Int) = BigInt(n)
  def factorial(x: BigInt): BigInt = (1 to x).reduceLeft(_ * _)
  def paths(x: BigInt): BigInt = factorial(2 * x) / (factorial(x) * factorial(x))
  println(paths(20))
}
