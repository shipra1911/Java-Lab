// Wap to show an Arithmetic exception in a program

public class ArithmeticExceptionEg {

  // Main method to demonstrate ArithmeticException
  public static void main(String[] args) {
      // Initialize a numerator and a denominator
      int numerator = 10;
      int denominator = 0; // This will cause the exception

      try {
          // Perform division operation which will cause an ArithmeticException
          int result = numerator / denominator;
          // This line will not be executed because of the exception
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          // Catch the ArithmeticException and print a message
          System.out.println("ArithmeticException caught: " + e.getMessage());
      }

      // Continue with the rest of the program
      System.out.println("Program continues after handling the exception.");
  }
}
