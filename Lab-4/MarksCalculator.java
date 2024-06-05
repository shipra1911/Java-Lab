// The class teacher wants to store the marks obtained in English, Maths and Science of her class having 40 students. Write a program to input marks in Eng, Science and Maths by using three single dimensional arrays. Calculate and print the following information: (i) Average marks secured by each student. (ii) Class average in each subject. [Hint: Class average is the average marks obtained by 40 students in a particular subject.

import java.util.Scanner;    // Importing Scanner class to take input from the user

public class MarksCalculator {  // Class declaration
    public static void main(String[] args) {   // Main method
        Scanner scanner = new Scanner(System.in);   // Creating a Scanner object to take input

        // Initialize arrays to store marks for each subject
        int[] englishMarks = new int[40];
        int[] scienceMarks = new int[40];
        int[] mathsMarks = new int[40];

        // Input marks for each subject for 40 students
        for (int i = 0; i < 40; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("English: ");
            englishMarks[i] = scanner.nextInt();
            System.out.print("Science: ");
            scienceMarks[i] = scanner.nextInt();
            System.out.print("Maths: ");
            mathsMarks[i] = scanner.nextInt();
        }

        // Calculate and print average marks secured by each student
        System.out.println("Average marks secured by each student:");
        for (int i = 0; i < 40; i++) {
            double averageMarks = (englishMarks[i] + scienceMarks[i] + mathsMarks[i]) / 3.0;
            System.out.println("Student " + (i + 1) + ": " + averageMarks);
        }

        // Calculate and print class average in each subject
        double englishClassAverage = calculateClassAverage(englishMarks);
        double scienceClassAverage = calculateClassAverage(scienceMarks);
        double mathsClassAverage = calculateClassAverage(mathsMarks);

        System.out.println("Class average in each subject:");
        System.out.println("English: " + englishClassAverage);
        System.out.println("Science: " + scienceClassAverage);
        System.out.println("Maths: " + mathsClassAverage);

        scanner.close();
    }

    // Method to calculate class average for a subject
    public static double calculateClassAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 40.0; // Divide by the total number of students
    }
}
