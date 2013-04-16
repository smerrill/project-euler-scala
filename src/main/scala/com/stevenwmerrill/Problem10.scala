package com.stevenwmerrill

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million
 */

class Problem10 {
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

  println(primeStream().takeWhile(_ < 2000000).sum)
}

object Problem10 {
  def main(args: Array[String]) {
    new Problem10
  }
}








