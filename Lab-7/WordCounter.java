// Accept two strings, a word and a sentence. Then find number of times the word is present in given string. If I enter 'THE' and 'THE BIG FAT THE ODORE', then the computer should display 2.

public class WordCounter {

  // Method to count occurrences of a word in a sentence
  public static int countOccurrences(String word, String sentence) {
      // Convert both word and sentence to lowercase to handle case insensitivity
      word = word.toLowerCase();
      sentence = sentence.toLowerCase();

      // Split the sentence into words using space as the delimiter
      String[] words = sentence.split(" ");

      // Initialize a counter to keep track of the occurrences
      int count = 0;

      // Loop through each word in the sentence
      for (String w : words) {
          // If the current word matches the given word, increment the counter
          if (w.equals(word)) {
              count++;
          }
      }

      // Return the total count of occurrences
      return count;
  }

  // Main method to test the word counting method
  public static void main(String[] args) {
      // Test word and sentence
      String word = "THE";
      String sentence = "THE BIG FAT THEODORE";

      // Count the occurrences of the word in the sentence
      int occurrences = countOccurrences(word, sentence);

      // Print the result
      System.out.println("The word '" + word + "' appears " + occurrences + " times in the sentence.");
  }
}
