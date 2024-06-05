import java.util.Scanner; // Import the Scanner class for user input

public class SurnameFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter a name with three words
        System.out.print("Enter a name (three words): ");
        String input = scanner.nextLine();

        // Call the method to rearrange the name and store the result
        String rearrangedName = rearrangeName(input);

        // Print the result
        System.out.println("Rearranged Name: " + rearrangedName);

        // Close the scanner
        scanner.close();
    }

    // Method to rearrange the name
    public static String rearrangeName(String name) {
        // Split the input string by spaces
        String[] words = name.split(" ");

        // Check if the input contains exactly three words
        if (words.length != 3) {
            return "Invalid input. Please enter exactly three words.";
        }

        // Construct the new format: surname first, followed by first and middle names
        String rearrangedName = words[2] + " " + words[0] + " " + words[1];

        // Return the rearranged name
        return rearrangedName;
    }
}
