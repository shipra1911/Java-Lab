// Write a program to remove all even numbers from an ArrayList and display.

import java.util.ArrayList; // Importing the ArrayList class
import java.util.Iterator; // Importing the Iterator class
import java.util.Scanner; // Importing the Scanner class

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Creating an ArrayList to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Taking input from the user
        System.out.println("Enter numbers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Using an Iterator to remove even numbers
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) { // Checking if the number is even
                iterator.remove(); // Removing the even number
            }
        }

        // Displaying the remaining numbers in the ArrayList
        System.out.println("ArrayList after removing even numbers: " + numbers);
        
        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
