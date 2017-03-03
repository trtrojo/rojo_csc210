//Area.java

 /* Area.java -- Calculating area of shapes
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * See CalcArea or page 590 for prompt.
 *
 * Class and functions to calculate the areas of shapes.
 *
 */


import java.lang.Math;

public class Area {
	
	/**
	 * Declared as requested.
	 */
	public Area() {
	//intentionally left empty
	}

	/**
	 * Calculating the area of a CIRCLE
	 *
	 * @param radius - Radius of the circle
	 */
	public double calcArea(double radius) {

		return (Math.PI*radius*radius);
	
	}

	/**
 	 * Calculate the area of a RECTANGLE Using float in order to
 	 * differentiate between this and area calcArea function.
 	 *
 	 * @param width - width of rectangle
 	 * @param length - length of rectangle
 	 */
	public float calcArea(float width, float length) {

		return (width*length);
	
	}

	/**
 	 * Calculate the area of a CYLINDER using double in order to
 	 * differentiate berween this and rectangle calcArea function.
 	 *
 	 * @param radius - width of cylinder
 	 * @param height - height of cylinder
 	 */
	public double calcArea(double radius, double height) {
	
		return (Math.PI*(radius*radius)*height);

	}

}
