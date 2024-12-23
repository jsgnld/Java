/* Aguinaldo, Jose Mari R. | BSCS 3-1 */
/* Abstraction */

public class Petpeeve {
    public static void main(String[] args) {

        // Abstract Idea = useless
        // Person p = new Person();

        // Concrete Idea = useful
        Person a = new Girl();
        Person b = new Boy();

        a.makeSound();
        b.makeSound();

        a.setName("Si Arf Arf");
        b.setName("Si Meow Meow");

        a.Showname();
        b.Showname();

        a.Whisperers();
        b.Whisperers();
    }
}