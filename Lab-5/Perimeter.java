// Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.

// Define the Perimeter class
public class Perimeter {

  // Method to calculate the perimeter of a square
  public double calculate(double side) {
      return 4 * side;
  }

  // Method to calculate the perimeter of a rectangle
  public double calculate(double length, double breadth) {
      return 2 * (length + breadth);
  }

  // Method to calculate the perimeter of a circle
  public double calculate(double radius, boolean isCircle) {
      // If the second parameter is true, it indicates the calculation for a circle
      return 2 * Math.PI * radius;
  }

  // Main method to demonstrate the Perimeter calculations
  public static void main(String[] args) {
      // Create an instance of Perimeter
      Perimeter perimeter = new Perimeter();

      // Calculate and print the perimeter of a square with side length 5
      double squarePerimeter = perimeter.calculate(5);
      System.out.println("Perimeter of the square: " + squarePerimeter);

      // Calculate and print the perimeter of a rectangle with length 5 and breadth 3
      double rectanglePerimeter = perimeter.calculate(5, 3);
      System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

      // Calculate and print the perimeter of a circle with radius 7
      double circlePerimeter = perimeter.calculate(7, true);
      System.out.println("Perimeter of the circle: " + circlePerimeter);
  }
}
