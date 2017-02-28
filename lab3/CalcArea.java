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

		System.out.println(AC.calcArea(20));
		System.out.println(AC.calcArea((float) 2,(float) 2));
		System.out.println(AC.calcArea((double) 2, (double) 2));

		

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
