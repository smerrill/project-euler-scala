package com.stevenwmerrill

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are
 * 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of
 * "and" when writing out numbers is in compliance with British usage.
 */
object Problem17 extends App {
  def letterCount(x: Int): Int = {
    numberToString(x).replaceAll(" ", "").replaceAll("-", "").length
  }

  def numberToString(x: Int): String = x match {
    case (x: Int) if x >= 100 && x < 1000 && x % 100 == 0 => numberToString(x / 100) + " hundred"
    case (x: Int) if x >= 100 && x < 1000 => numberToString(x - (x % 100)) + " and " + numberToString(x % 100)
    case (x: Int) if x >= 20 && x <= 99 && x % 10 != 0 => numberToString(x - (x % 10)) + "-" + numberToString(x % 10)
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case 4 => "four"
    case 5 => "five"
    case 6 => "six"
    case 7 => "seven"
    case 8 => "eight"
    case 9 => "nine"
    case 10 => "ten"
    case 11 => "eleven"
    case 12 => "twelve"
    case 13 => "thirteen"
    case 14 => "fourteen"
    case 15 => "fifteen"
    case 16 => "sixteen"
    case 17 => "seventeen"
    case 18 => "eighteen"
    case 19 => "nineteen"
    case 20 => "twenty"
    case 30 => "thirty"
    case 40 => "forty"
    case 50 => "fifty"
    case 60 => "sixty"
    case 70 => "seventy"
    case 80 => "eighty"
    case 90 => "ninety"
    // @TODO: This is a cop-out for the problem at hand.
    case 1000 => "one thousand"
  }

  println((1 to 1000) map letterCount sum)
}
