// Write a program to find the Lowest Common Multiple (LCM) of two numbers by GCD (Greatest Common Divisor) of the numbers. GCD of two integers is calculated by continued division method. Divide the larger number by the smaller, the remainder then divides the previous divisor. The process is repeated till the remainder is zero. The divisor then results in the GCD.

public class LCMByGCD {

  public static void main(String[] args) {
      // Initialize the two numbers
      int num1 = 56;
      int num2 = 98;

      // Calculate the GCD using the continued division method
      int gcd = findGCD(num1, num2);

      // Calculate the LCM
      int lcm = (num1 * num2) / gcd;

      // Print the LCM
      System.out.println("The Lowest Common Multiple of " + num1 + " and " + num2 + " is: " + lcm);
  }

  // Method to calculate the GCD using the continued division method
  private static int findGCD(int num1, int num2) {
      if (num2 == 0) {
          return num1;
      }
      return findGCD(num2, num1 % num2);
  }
}