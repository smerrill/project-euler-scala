package com.stevenwmerrill

/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n => n/2 (n is even)
 * n => 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 => 40 => 20 => 10 => 5 => 16 => 8 => 4 => 2 => 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
class Problem14 {
  def collatzStream(n: Long): Stream[Long] = {
    Stream.cons(n,
      if (n == 1) Stream.empty
      else if (n % 2 == 0) collatzStream(n / 2)
      else collatzStream(3 * n + 1)
    )
  }
  println((for (i <- 1 to 1000000) yield (collatzStream(i).length, i)).sorted.last)
}

object Problem14 {
  def main(args: Array[String]) {
    new Problem14
  }
}
