/* Aguinaldo, Jose Mari R. | BSCS 3-1 */
/* Hybrid Inheritance */

class GrandParent { // class definition
    void data() {
        System.out.println("The First Generation na lang sige.");
    }
}
class Father extends GrandParent {
    void info() {
        System.out.println("The Second Generation yaaaaZir!");
    }
}
class Son extends Father {
    void show() {
        System.out.println("The Third Generation lezzzzgaw raaawr!");
    }
}
class Daughter extends Father {
    void display() {
        System.out.println("The Third Generation lezzzzgaw kyaaaah!");
    }
}
class HybridInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        Daughter d = new Daughter();
        s.data();
        s.info();
        s.show();
        d.data();
        d.info();
        d.display();
    }
}