//Geometry.java

 /* Geometry.java -- Calculating area of shapes
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *
 * See CalcGeometry or page 590 for prompt.
 *
 * Class and functions to calculate the areas of shapes.
 *
 */


import java.lang.Math;

public class Geometry {
	
	/**
	 * Declared as requested.
	 */
	public Geometry() {
	//intentionally left empty
	}

	/**
	 * Calculating the area of a CIRCLE
	 *
	 * @param radius - Radius of the circle
	 */
	public static double calcCircleArea(double radius) {

		return (Math.PI*radius*radius);
	
	}

	/**
 	 * Calculate the area of a RECTANGLE Using float in order to
 	 * differentiate between this and area calcGeometry function.
 	 *
 	 * @param width - width of rectangle
 	 * @param length - length of rectangle
 	 */
	public static double calcRectangleArea(double width, double length) {

		return (width*length);
	
	}

	/**
 	 * Calculate the area of a TRIANGLE using double in order to
 	 * differentiate berween this and rectangle calcGeometry function.
 	 *
 	 * @param radius - width of triangle
 	 * @param height - height of triangle
 	 */
	public static double calcTriangleArea(double base, double height) {
	
		return (base*height*(0.5));

	}

}
