// Write a program to input a number and check whether it is a Kaprekar number or not. Take a positive whole number n that has d number of digits. Take the square n and separate the result into two pieces: a right-hand piece that has d digits and a left-hand piece that has either d or d-1 digits. Add these two pieces together. If the result is n, then n is a Kaprekar number.

import java.util.Scanner;    // Importing Scanner class to take input from the user

public class KaprekarNumberChecker {   // Class declaration
    public static void main(String[] args) {     // Main method
        Scanner scanner = new Scanner(System.in);    // Creating a Scanner object to take input

        // Input a number from the user
        System.out.print("Enter a positive whole number: ");
        int number = scanner.nextInt();

        // Calculate the square of the number
        long square = (long) number * number;

        // Count the number of digits in the original number
        int digits = String.valueOf(number).length();

        // Calculate the right and left parts of the square
        long rightPart = square % (long) Math.pow(10, digits);
        long leftPart = square / (long) Math.pow(10, digits);

        // Check if the sum of the right and left parts equals the original number
        if (rightPart + leftPart == number) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }

        scanner.close();   // Closing the Scanner object
    }
}
