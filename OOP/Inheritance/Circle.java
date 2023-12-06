/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Activity 1: Inheritance
 */

public class Circle extends Shape {
    // Static method to calculate the diameter of a circle
    public static double getDiameter(double radius) {
        double diameter = radius * 2;
        return diameter;
    } // public static double getDiameter(double radius)
} // public class Circle extends Shape