// Write a program to accept 10 states and 10 capitals of country in two different single dimensional array. Now, enter a state of the country to display its capital. If it is present then display its capital otherwise, display a relevant message. Sample input: enter the state and the capital Bihar Patna West Bengal Kolkata and so on--

import java.util.Scanner;    // Importing Scanner class to take input from the user

public class StateCapitalFinder {   // Class declaration
    public static void main(String[] args) {   // Main method
        Scanner scanner = new Scanner(System.in);   // Creating a Scanner object to take input

        // Initialize arrays to store states and capitals
        String[] states = new String[10];
        String[] capitals = new String[10];

        // Input states and capitals
        System.out.println("Enter the names of 10 states and their capitals:");
        for (int i = 0; i < 10; i++) {
            System.out.print("State " + (i + 1) + ": ");
            states[i] = scanner.nextLine();
            System.out.print("Capital: ");
            capitals[i] = scanner.nextLine();
        }

        // Prompt user to enter a state
        System.out.print("Enter the state whose capital is to be searched: ");
        String stateToSearch = scanner.nextLine();

        // Search for the state and display its capital if found
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (states[i].equalsIgnoreCase(stateToSearch)) {
                System.out.println("The capital is " + capitals[i]);
                found = true;
                break;
            }
        }

        // If state is not found, display relevant message
        if (!found) {
            System.out.println("State not found in the list.");
        }

        scanner.close();   // Closing the Scanner object
    }
}
