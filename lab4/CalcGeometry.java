//CalcGeometry.java

 /* CalcGeometry.java -- Calculating Geometry of various shapes.
  * 
  * Tommy ROjo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on (Book 557, PDF 594)
  *
  *
  *
  *
  *
  */

import java.util.Scanner;

public class CalcGeometry {

	public static void main(String[] args) {
		double selector;

		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit\n");
		System.out.println("Enter your choice (1-4):");
		selector = getDoubleInput("Enter your choice (1-4)");
	}

	public static double getDoubleInput(String prompt) {
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print(prompt + ": ");

		return (KeyboardInput.nextDouble());
	}
}
