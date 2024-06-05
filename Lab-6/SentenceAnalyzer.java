// Write a program to input a sentence and count number of vowels , digits , words and special characters .

import java.util.Scanner;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Initialize counters for vowels, digits, and special characters
        int vowelCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if the character is a vowel
            if (isVowel(ch)) {
                vowelCount++;
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                digitCount++;
            }
            // Check if the character is a special character (neither a letter nor a digit)
            else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        // Split the sentence by whitespace to count words
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        // Print the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of special characters: " + specialCharCount);

        // Close the scanner
        scanner.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert character to lowercase
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
