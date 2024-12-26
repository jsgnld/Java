package JAVA.Practice2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle's area: " + area);
        return area;
    }
}
