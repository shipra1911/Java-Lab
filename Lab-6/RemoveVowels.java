// Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.

import java.util.Scanner; // Import the Scanner class for user input

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter a string
        System.out.print("Enter a word/string: ");
        String input = scanner.nextLine();

        // Call the method to remove vowels and store the result
        String result = removeVowels(input);

        // Print the result
        System.out.println("String after removing vowels: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to remove vowels from a given string
    public static String removeVowels(String str) {
        // StringBuilder is used to build the new string without vowels
        StringBuilder noVowels = new StringBuilder();

        // Convert the input string to uppercase for uniformity
        str = str.toUpperCase();

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            // Check if the character is not a vowel
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                noVowels.append(ch); // Append the character to the StringBuilder if it's not a vowel
            }
        }

        // Convert the StringBuilder to a string and return it
        return noVowels.toString();
    }
}
