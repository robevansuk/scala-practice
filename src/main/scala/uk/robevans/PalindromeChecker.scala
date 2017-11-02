package uk.robevans

object PalindromeChecker extends App {

  def isPalindrome(word: String) = {
    val modifiedWord = word.toLowerCase.replaceAll("[^a-z0-9]", "")
    val reversed = modifiedWord.reverse
    modifiedWord == reversed
  }

  val word = "level"
  println("Is '" + word + "' a palindrome? " + isPalindrome(word))

}
