package JAVA.Practice2;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(side, 2);
        System.out.println("Square's area: " + area);
        return area;
    }
}