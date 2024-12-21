package JAVA.OOP.Polymorphism.Example2;

public class Identify {
    public static void main(String[] args) {

        // Instance of a Person, Animal, Insect
        // Assuming Person has a concrete subclass named 'Petpeeve'
        Daisy d = new Daisy();
        Sunflower s = new Sunflower();
        Larkspur l = new Larkspur();

        // Array of Pickers where we need a Polymorphic Array
        Flower[] pickers = {d, s, l};

        // instead of calling each object's color method, we can loop through the array
        // d.color();
        // s.color();
        // l.color();

        for(Flower f: pickers) {
            f.color();
        }
    }
}