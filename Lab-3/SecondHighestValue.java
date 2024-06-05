// Write a Java Program to find the second highest value in a numeric array.

import java.util.Arrays;

public class SecondHighestValue {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {10, 20, 5, 25, 30, 15};

        // Find the second highest value
        int secondHighest = findSecondHighest(numbers);

        // Print the result
        System.out.println("Second highest value in the array: " + secondHighest);
    }

    // Function to find the second highest value
    public static int findSecondHighest(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // The second highest element will be at index length - 2
        // (second last element if the array is sorted)
        return arr[arr.length - 2];
    }
}
