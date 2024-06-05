//  Write a program in Java to accept the name of an employee and his/her annual income. Pass the name and the annual income. Displays the name of the employee and the income tax as per the given tariff:

import java.util.*;

public class Tax {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept the name of the employee
	        System.out.println("Enter the name of the employee:");
	        String employeeName = scanner.nextLine();

	        // Accept the annual income of the employee
	        System.out.println("Enter the annual income of the employee (in ₹):");
	        double annualIncome = scanner.nextDouble();

	        // Calculate income tax based on the tariff
	        double tax = 0;

	        if (annualIncome <= 250000) {
	            // No tax
	            tax = 0;
	        } else if (annualIncome <= 500000) {
	            // 10% of the income exceeding ₹2,50,000
	            tax = 0.1 * (annualIncome - 250000);
	        } else if (annualIncome <= 1000000) {
	            // ₹30,000 + 20% of the amount exceeding ₹5,00,000
	            tax = 30000 + 0.2 * (annualIncome - 500000);
	        } else {
	            // ₹50,000 + 30% of the amount exceeding ₹10,00,000
	            tax = 50000 + 0.3 * (annualIncome - 1000000);
	        }

	        // Display the name of the employee and the income tax
	        System.out.println("Name of the employee: " + employeeName);
	        System.out.println("Income tax: " + tax);

	        scanner.close();
	    }
	}