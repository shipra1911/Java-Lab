// Write a program to input 10 integers and find the sum of two-digit as well as three-digit numbers separately.

import java.util.Scanner; // Importing Scanner class to take input from the user

public class DigitSumCalculator { // Class declaration
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in);  // Creating a Scanner object to take input

        int twoDigitSum = 0; // Variable to store the sum of two-digit numbers
        int threeDigitSum = 0; // Variable to store the sum of three-digit numbers

        // Loop to input 10 integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": "); // Prompting the user to enter an integer
            int number = scanner.nextInt(); // Reading the integer input from the user

            // Checking if the number is a two-digit number
            if (number >= 10 && number <= 99) {
                twoDigitSum += number; // Adding the two-digit number to the sum
            } 
            // Checking if the number is a three-digit number
            else if (number >= 100 && number <= 999) {
                threeDigitSum += number; // Adding the three-digit number to the sum
            }
        }

        // Printing the sum of two-digit and three-digit numbers
        System.out.println("Sum of two-digit numbers: " + twoDigitSum);
        System.out.println("Sum of three-digit numbers: " + threeDigitSum);

        scanner.close(); // Closing the Scanner object
    }
}
