package JAVA.Practice2;

public class MyShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(0);
        shapes[1] = new Square(0);
        shapes[2] = new Triangle(0, 0);
        for (Shape shape : shapes) {
            shape.draw();
            shape.calculateArea();
        }
    }
    
}