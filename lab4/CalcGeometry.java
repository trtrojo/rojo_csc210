//CalcGeometry.java

 /* CalcGeometry.java -- Calculating Geometry of various shapes.
  * 
  * Tommy ROjo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on (Book 557, PDF 594)
  *
  * This is the frontend app for demonstrating the geometry class assigned
  * as part of the lab assignment.
  */

import java.util.Scanner;

public class CalcGeometry {

	/**
 	 * Menus and input sanitation for the geometry calculator.
 	 *
 	 */

	public static void main(String[] args) {
		int selector;
		//int c = 1;
		double x;
		double y;

		while (true) {
			System.out.println("Geometry Calculator");
			System.out.println("1. Calculate the Area of a Circle");
			System.out.println("2. Calculate the Area of a Rectangle");
			System.out.println("3. Calculate the Area of a Triangle");
			System.out.println("4. Quit\n");
			selector = (int) getDoubleInput("Enter your choice (1-4)");
			if (selector < 1 || selector > 4) {
				System.out.println("Invalid Selecton. Try again.");
				System.exit(1);
			}

			//for calculating circle
			else if (selector == 1) {
				x = getDoubleInput("What is the radius of the circle?");
				while (x < 0) { 
					x = getDoubleInput("Radius cannot be less than 0. Try again");
				}
				System.out.println("The radius of the circle is " + Geometry.calcCircleArea(x));
			}
	
			//for calculating rectangle
			else if (selector == 2) {
				x = getDoubleInput("What is the length of the rectangle?");
				while (x < 0) {
					x = getDoubleInput("The Length cannot be less than 0. Try Again");
				}
				y = getDoubleInput("What is the width of the rectangle?");
				while (y < 0) {
					y = getDoubleInput("The Width cannot be less than 0. Try Again");
				}
				System.out.println("The Area of the rectangle is " + Geometry.calcRectangleArea(y,x));
			}
	
			//for calculating triangle
			else if (selector == 3) {
				x = getDoubleInput("What is the triangle's base length?");
				while (x < 0) {
					x = getDoubleInput("The length cannot be less than 0. Try again.");
				}
				y = getDoubleInput("What is the triangle's height?");
				while (y < 0) {
					y = getDoubleInput("The height cannot be less than 0. Try again");
				}
				System.out.println("The area of the triangle is " + Geometry.calcTriangleArea(x,y));
			}
	
			//for exiting the app.
			else if (selector == 4) {
				System.exit(0);
			}

	}
	
		
	}

	/**
 	 * Asks the user a question, then prompt for a double input, which will be
 	 * returned to the calling function.
 	 *
 	 * @param prompt - What to prompt the user with.
 	 */

	public static double getDoubleInput(String prompt) {
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print(prompt + ": ");

		return (KeyboardInput.nextDouble());
	}
}
