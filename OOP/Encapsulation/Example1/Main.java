package JAVA.OOP.Encapsulation.Example1;
public class Main {
    public static void main(String[] args) {
        
        Car style = new Car("Toyota", "Corolla", "2020");
        System.out.println("Make: " + style.getMake());
        System.out.println("Model: " + style.getModel());
        System.out.println("Year: " + style.getYear());
    }
}