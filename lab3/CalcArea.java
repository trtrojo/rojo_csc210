//CalcArea.java

 /* CalcArea.java -- Calculating areas of shapes
  *
  * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
  *
  * Follow the instructions on page 590 to create an area calculator. Prompt
  * below.
  *
  * 1. Area Class
  * 	Write a class that has three overloaded static methods for calculating
  * 	the areas of the following geometric shapes:
  * 		- Circles (Area = (pi)*(radius^2))
  * 		- Rectangles (Area = (Width)*(Length)
  * 		- Cylinders (Area = (pi)*(radius^2)*(height)
  *
  * Use Math.PI for pi, radius is cylinder radius, h is cylinder height
  *
  * Because the three methods are to be overloaded, they should each have the
  * same name, but different parameter lists. Demonstrate the class in a 
  * complete program.
  *
  * Class-Specific Note: Make sure to create a class function, even if it
  * 	is empty.
  *
  *
  * Frontend app to show off AreaCalculator class.
  *
  */

import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		double area;
		float width;
		float length;
		double height;
		double radius;

		AreaCalculator AC = new AreaCalculator();

		System.out.println("Area Calculator -- Follow page 590 for details");

		calcAreaPrompt();
		

	}

	public static void calcAreaPrompt() {
		double sendType;
		double width;
		double length;
		double height;
		double radius;

		AreaCalculator AC = new AreaCalculator();

		System.out.println("Enter 1 for area of a circle");
		System.out.println("Enter 2 for area of a rectangle");
		System.out.println("Enter 3 for area of a cylinder");	
		
		sendType = getDoubleInput("Type?");
		
		if (sendType == 1) { //Area of Circle
			radius = getDoubleInput("What is the radius?");
				while(radius < 0){ radius = getDoubleInput("Radius can't be negative. What is the Radius?"); }
			System.out.println("The area of the circle is " + AC.calcArea(radius));
		}
		else if (sendType == 2) { //Area of Rectangle
			width = getDoubleInput("What is the width?");
				while (width < 0) { width = getDoubleInput("Width can't be negative. What is the width?"); }
			length = getDoubleInput("What is the length?");
				while (length < 0) { length = getDoubleInput("Length can't be negative. What is the length?"); }
			System.out.println("The area of the rectangle is " + AC.calcArea((float) width,(float) length));
		}
		else if (sendType == 3) { //Area of Cylinder
			radius = getDoubleInput("What is the radius?");
				while (radius < 0) { radius = getDoubleInput("Radius can't be negative. What is the radius?"); }
			height = getDoubleInput("What is the height?");
				while (height < 0) { height = getDoubleInput("Height can't be negative. What is the heiht?"); }
			System.out.println("The area of the cylinder is " + AC.calcArea(radius,height));
		}
			
	}
		
        /* getDoubleInput(prompt)
         *
         * prints a prompt based on the question and returns a double
         *
         * usage: double x = getDoubleInput("How much are you in debt?");
         */
        public static double getDoubleInput(String prompt) {

                Scanner KeyboardInput = new Scanner(System.in);
                System.out.print(prompt + " > ");

                return (KeyboardInput.nextDouble());
        }

}		
