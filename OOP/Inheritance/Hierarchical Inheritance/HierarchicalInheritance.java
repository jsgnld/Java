/* Aguinaldo, Jose Mari R. | BSCS 3-1 */
/* Hierarchical Inheritance */

class Parent { // class definition
    void data() { // method declaration
        System.out.println("Super Class value is: 1");
    }
}
class FirstChild extends Parent { // inheriting its properties and methods
    void info() {
        System.out.println("First Case Class value is: 2");
    }
}
class SecondChild extends Parent {
    void show() {
        System.out.println("Second Base Class value is: 3");
    }
}
class ThirdChild extends Parent {
    void display() {
        System.out.println("Third Base Class value is: 4");
    }
}
class HierarchicalInheritance { // claass is defined to test hierarchical inheritance
    public static void main(String[] args) {

        // object creation
        FirstChild fc = new FirstChild();
        SecondChild sc = new SecondChild();
        ThirdChild tc = new ThirdChild();

        // calling methods to demonstrate inheritance and individual functionalities
        fc.data();
        fc.info();
        sc.data();
        sc.show();
        tc.data();
        tc.display();
    }
}