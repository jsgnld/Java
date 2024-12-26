package JAVA.Practice2;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle's area: " + area);
        return area;
    }
}