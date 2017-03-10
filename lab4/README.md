Lab 4 - Assigned 3.4.17 -- Due 3.11.17
===
Book 557, PDF 594 - Geometry Calculator:
---
Design a Geometry class with the following methods:

 - A static method that accepts the radius of a circle and retuns the area of the circle.
   -Use the following forumla: A = 5(pi)r
   -Use Math.PI for (pi) and the radius of the circle for r.

 - A static method that accepts the length and width of a rectangle and returns the area of
    the area of the rectangle.
   -Use the following forumla: A = Length * Width

 - A static method that accepts the length of a triangle's base and the triangle's height.
    The method should return the area of the triangle. 
   -Use the following formula: A = Base * Height * (0.5)

 - The methods should display an error message if negative values are used for the
    circle's radius, the rectangle's length, or the triangle's base or height.

 - Next, write a program to test the class, which displays the following menu and responds
    to the user's selection:

```
Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit

Enter your choice (1-4):
```

 - Display an error message if the user enters a number outside the range of 1
    through 4 when selecting an item from the menu.
