package JAVA.OOP.Polymorphism.Example1;
/* Aguinaldo, Jose Mari R. | BSCS -1 */
/* Polymorphism */

class Bird {
    public void sing() {
        System.out.println("Bird is singing");
    }
}
// Inheritance - One Bird
class Pesto extends Bird {
    public void sing() {
        System.out.println("June glooom, tule fog~");
    }
}
    // Inheritance - Another Bird
class Twitty extends Bird {
    public void fly() {
        System.out.println("Twitty is flying? so yaaaaaz!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Bird b = new Bird();
        // b.sing();
        Pesto p = new Pesto();
        // Twitty t = new Twitty();

        p.sing(); // Since Pesto know the method sing, it will use/prioritizes the one directly in the class Pesto
    }

}