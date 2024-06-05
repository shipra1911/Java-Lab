// Write a program in Java to accept a name(Containing three words) and display only the initials (i.e., first letter of each word).

import java.util.Scanner; // Import the Scanner class for user input

public class NameInitials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter a name with three words
        System.out.print("Enter a name (three words): ");
        String input = scanner.nextLine();

        // Call the method to get initials and store the result
        String initials = getInitials(input);

        // Print the result
        System.out.println("Initials: " + initials);

        // Close the scanner
        scanner.close();
    }

    // Method to get the initials of a given name
    public static String getInitials(String name) {
        // Split the input string by spaces
        String[] words = name.split(" ");

        // StringBuilder is used to build the initials string
        StringBuilder initials = new StringBuilder();

        // Loop through each word in the array
        for (String word : words) {
            // Append the first character of each word to the StringBuilder
            initials.append(word.charAt(0)).append(" ");
        }

        // Convert the StringBuilder to a string, trim any trailing spaces, and return it
        return initials.toString().trim();
    }
}
