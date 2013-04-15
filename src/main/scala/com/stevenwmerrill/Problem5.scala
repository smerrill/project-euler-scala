package com.stevenwmerrill

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

class Problem5 {
  def filterRange(upperBound: Long)(x: Long): Boolean = {
    def loop(i: Long): Boolean = {
      if (i > upperBound) true
      else if (x % i != 0) false
      else loop(i + 1)
    }
    loop(1)
  }
  def takeUntil(f: Long => Boolean): Long = {
    def loop(i: Long): Long = {
      if (f(i)) i
      else loop(i + 1)
    }
    loop(1)
  }
  println(takeUntil(filterRange(20)))
}

object Problem5 {
  def main(args: Array[String]) {
    new Problem5
  }
}


