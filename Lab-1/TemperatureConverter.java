// Write a program to convert temperature using if condition 1. faenheit to celcius 2 celcius to faenheit.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display options for the user to choose a conversion
        System.out.println("Choose an option:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        // Read the user's choice
        int choice = scanner.nextInt();

        // Use if-else statements to handle different choices
        if (choice == 1) {
            // If the user chose Fahrenheit to Celsius conversion
            System.out.println("Enter temperature in Fahrenheit:");
            // Read temperature in Fahrenheit from the user
            double fahrenheit = scanner.nextDouble();
            // Convert Fahrenheit to Celsius using the formula (F - 32) * 5/9
            double celsius = (fahrenheit - 32) * 5 / 9;
            // Print the temperature in Celsius
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (choice == 2) {
            // If the user chose Celsius to Fahrenheit conversion
            System.out.println("Enter temperature in Celsius:");
            // Read temperature in Celsius from the user
            double celsius = scanner.nextDouble();
            // Convert Celsius to Fahrenheit using the formula (C * 9/5) + 32
            double fahrenheit = (celsius * 9 / 5) + 32;
            // Print the temperature in Fahrenheit
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            // If the user entered an invalid choice, display an error message
            System.out.println("Invalid choice.");
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
