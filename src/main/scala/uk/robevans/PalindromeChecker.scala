package uk.robevans

import java.security.SecureRandom

object PalindromeChecker extends App {

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def isPalindrome(word: String) = {
    val modifiedWord = word.toLowerCase.replaceAll("[^a-z0-9]", "")
    val reversed = modifiedWord.reverse
    modifiedWord == reversed
  }

//  val randomInt() : Int = {
//    val randomGen = new SecureRandom()
//    val bytes: Array[Byte] = new Array[Byte](20)
//    val randomInt = randomGen.nextBytes(bytes)
//
//  }

  val word = "level"
  val anotherWord = "notAPalindrome"
  println("Is '" + word + "' a palindrome? " + isPalindrome(word))
  println(" Is Random Word '" + anotherWord + "' a palindrome? " + isPalindrome(anotherWord))

}
