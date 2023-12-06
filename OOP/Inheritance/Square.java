/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Activity 1: Inheritance
 */

public class Square extends Shape {
    // Static method to calculate the area of a square
    public static double getArea(double side) {
        double area = Math.pow(side, 2);
        return area;
    } // public static double getArea(double side)
} // public class Square extends Shape