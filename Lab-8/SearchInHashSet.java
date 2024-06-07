// Write a program to create a Hashset by inputting 10 strings and search a particular string in the set and display proper message

import java.util.HashSet; // Importing the HashSet class
import java.util.Scanner; // Importing the Scanner class

public class SearchInHashSet {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Creating a HashSet to store the strings
        HashSet<String> stringSet = new HashSet<>();

        // Taking 10 strings as input from the user and adding them to the HashSet
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            System.out.print("String " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stringSet.add(input);
        }

        // Asking the user to enter a string to search in the HashSet
        System.out.print("Enter a string to search: ");
        String searchString = scanner.nextLine();

        // Checking if the string is present in the HashSet
        if (stringSet.contains(searchString)) {
            System.out.println("The string '" + searchString + "' is present in the set.");
        } else {
            System.out.println("The string '" + searchString + "' is not present in the set.");
        }

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
