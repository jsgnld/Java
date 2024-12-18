/* Aguinaldo, Jose Mari R. | BSCS 3-1 */
/* Multilevel Inheritance */

class Parent {
    void data() {
        System.out.println("Super Class value is: 1");
    }
}
class FirstChild extends Parent {
    void info() {
        System.out.println("First Case Class value is: 2");
    }
}
class SecondChild extends FirstChild {
    void show() {
        System.out.println("Second Base Class value is: 3");
    }
}
class MultilevelInheritance {
    public static void main(String[] args) {
        SecondChild sc = new SecondChild();
        sc.data();
        sc.info();
        sc.show();
    }
}