// Write a program to create an array of strings and sort them in a ascending order.

import java.util.Arrays; // Importing the Arrays class for sorting

public class StringSorter {
    public static void main(String[] args) {
        // Create an array of strings
        String[] strings = { "apple", "orange", "banana", "grape", "cherry" };

        // Print the original array
        System.out.println("Original array:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Sort the array in ascending order
        Arrays.sort(strings);

        // Print the sorted array
        System.out.println("\nSorted array:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
