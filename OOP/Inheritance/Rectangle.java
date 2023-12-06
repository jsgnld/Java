/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Activity 1: Inheritance
 */

public class Rectangle extends Shape {
    // Static method calculate the area of a rectangle
    public static double getArea(double length, double breadth) {
        double area = length * breadth;
        return area;
    } // public static double getArea(double length, double breadth)
} // public class Rectangle extends Shape
