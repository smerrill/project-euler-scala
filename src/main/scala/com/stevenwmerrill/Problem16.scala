package com.stevenwmerrill

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
object Problem16 extends App {
  implicit def charToInt(x: Char): Int = x.toString.toInt
  println(
    BigInt(2).pow(1000).toString.foldLeft(0)(_ + _)
  )
}
