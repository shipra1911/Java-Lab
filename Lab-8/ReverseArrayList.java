// Write a program to reverse the order of elements in an ArrayList. (Hint: Use a loop or recursion).

import java.util.ArrayList; // Importing the ArrayList class
import java.util.Collections; // Importing the Collections class
import java.util.Scanner; // Importing the Scanner class

public class ReverseArrayList {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList to store the elements
        ArrayList<Integer> numbers = new ArrayList<>();

        // Taking input from the user
        System.out.println("Enter numbers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Reversing the order of elements using Collections.reverse()
        Collections.reverse(numbers);

        // Displaying the reversed ArrayList
        System.out.println("Reversed ArrayList: " + numbers);

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
