package JAVA.OOP.Polymorphism.Overloading;
/* Aguinaldo, Jose Mari R. | BSCS -1 */
/* Polymorphism - Method Overloading */

class Flower {
    public void color() {
        System.out.println("The flower has a generic color.");
    }
   
    public void color(String shade) {
        System.out.println("The flower has a specific color: " + shade);
    }
}

class Daisy extends Flower {
    @Override
    public void color() {
        System.out.println("Daisy is white.");
    }
}

class Sunflower extends Flower {
    @Override
    public void color() {
        System.out.println("Sunflower is yellow.");
    }
    
    public void color(int intensity) {
        System.out.println("Sunflower's yellow has an intensity of: " + intensity);
    }
}

class Larkspur extends Flower {
    @Override
    public void color() {
        System.out.println("Larkspur is purple.");
    }
}

public class Identify {
    public static void main(String[] args) {
        // Instances of Flowers
        Daisy d = new Daisy();
        Sunflower s = new Sunflower();
        Larkspur l = new Larkspur();
        
        // Array of Flowers (Polymorphism)
        Flower[] pickers = {d, s, l};
        
        // Loop through the array
        for (Flower f : pickers) {
            f.color();
        }
        
        System.out.println("\nDemonstrating Overloaded Methods:");
        
        d.color("light yellow");
        s.color(80);
        l.color("deep purple");
    }
}