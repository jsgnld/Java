// Multiple Inheritance

interface First { // blueprint
    void info();
}
interface Second { // blueprint
    void show();
}

class Demo implements First, Second {
    public void info() {
        System.out.println("First Interface");
    }
    public void show() {
        System.out.println("Second Interface");
    }

    // Adding display method inside the Demo class
    public void display() {
        System.out.println("From class method");
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.info();
        d.show();
        d.display();
    }
}