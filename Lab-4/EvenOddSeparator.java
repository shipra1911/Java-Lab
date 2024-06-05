// Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer and store all the even numbers in an array even[ ] and all the odd numbers in another array odd[ ]. Finally, print the elements of both the arrays.

import java.util.Scanner;   // Importing Scanner class to take input from the user

public class EvenOddSeparator {   // Class declaration
    public static void main(String[] args) {    // Main method
        Scanner scanner = new Scanner(System.in);    // Creating a Scanner object to take input

        // Initialize arrays to store even and odd numbers
        int[] arr = new int[20];
        int[] even = new int[20]; // The size is set to maximum possible, it can be optimized
        int[] odd = new int[20];  // The size is set to maximum possible, it can be optimized

        // Accept 20 numbers into the array
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
        }

        // Separate even and odd numbers into separate arrays
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }

        // Print even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        scanner.close();   // Closing the Scanner object
    }
}
