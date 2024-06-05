// Write a program to input a sentence and find the longest word.

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");

        // Initialize a variable to keep track of the longest word
        String longestWord = "";

        // Loop through each word in the array
        for (String word : words) {
            // Check if the current word is longer than the longest word found so far
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Print the longest word
        System.out.println("The longest word is: " + longestWord);

        // Close the scanner
        scanner.close();
    }
}
