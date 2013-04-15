package com.stevenwmerrill

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

class Problem7 {
  def divisors(x: Long): List[Long] = (1L to (math.sqrt(x).toLong)).filter(x % _ == 0).toList.flatMap(y => List(y, x / y)).sorted
  def isPrime(x: Long): Boolean = x > 1 && divisors(x) == List(1, x)

  def nextPrime(x: Long): Long = {
    def loop(i: Long): Long = {
      if (isPrime(i)) i
      else loop(i + 1)
    }
    loop(x)
  }

  def primeStream(start: Long = 2L): Stream[Long] = {
    val x = nextPrime(start)
    Stream.cons(x, primeStream(x + 1))
  }

  println(primeStream().take(10001).last)
}

object Problem7 {
  def main(args: Array[String]) {
    new Problem7
  }
}



