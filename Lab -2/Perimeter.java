// Write a class with the name Perimeter using function overloading that computes the perimeter of a square, a rectangle and a circle.

import java.util.*;

public class Perimeter {

	public static void main(String[] args) {

		        try (Scanner scanner = new Scanner(System.in)) {
              System.out.println("Enter the shape (1 for square, 2 for rectangle, 3 for Circle):");

              int ch = scanner.nextInt();

              
              double perimeter = 0;
              

              switch(ch) {

                  case 1: // Square

                      System.out.println("Enter the side length of the square:");

                      int side = scanner.nextInt();

                      perimeter = 4 * side;

                      break;

                  case 2: // Rectangle

                      System.out.println("Enter the length of the rectangle:");

                      int length = scanner.nextInt();

                      System.out.println("Enter the width of the rectangle:");

                      int width = scanner.nextInt();

                      perimeter = 2 * (length + width);

                      break;

                  case 3: // Circle

                      System.out.println("Enter the Radius of the Circle:");

                      int r = scanner.nextInt();

                      perimeter =  2*3.14*r;

                      break;

                  default:System.out.println("Invalid choice!");

              }
            
              System.out.println("Perimeter: " + perimeter);
            }	        

		    }	

	}