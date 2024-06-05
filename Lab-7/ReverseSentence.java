// Write a program for converting a sentence in reverse. (Input: BASIC IS PROGRAMMING     Output: PROGRAMMING IS BASIC)

public class ReverseSentence {

  // Method to reverse the words in a sentence
  public static String reverseWords(String sentence) {
      // Split the sentence into words using space as the delimiter
      String[] words = sentence.split(" ");

      // Initialize an empty string to store the reversed sentence
      String reversedSentence = "";

      // Loop through the words array in reverse order
      for (int i = words.length - 1; i >= 0; i--) {
          // Add the current word to the reversed sentence
          reversedSentence += words[i];

          // Add a space between words, but not after the last word
          if (i != 0) {
              reversedSentence += " ";
          }
      }

      // Return the reversed sentence
      return reversedSentence;
  }

  // Main method to test the reverseWords method
  public static void main(String[] args) {
      // Test sentence
      String sentence = "BASIC IS PROGRAMMING";

      // Reverse the words in the sentence
      String reversedSentence = reverseWords(sentence);

      // Print the result
      System.out.println("Reversed sentence: " + reversedSentence);
  }
}
