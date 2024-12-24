// Enumerated type = enum: ordered listing of items in a collection

public class Enum2 {
    
    enum Planet {
        MERCURY(1), 
        VENUS(2), 
        EARTH(3), 
        MARS(4), 
        JUPITER(5), 
        SATURN(6), 
        URANUS(7),
        NERPTUNE(8), 
        PLUTO(9);

        // determine which number planet
        int number;

        // constructor
        Planet(int number) {
            this.number = number;
        }

    }
    public static void main(String[] args) {
        
        // 1. Instantiate an instance (can change)
        Planet myPlanet = Planet.EARTH;

        // 4. Call the function
        canILiveHere(myPlanet);
    }

    // 2. Create a Method
    static void canILiveHere(Planet myPlanet) {

        // 3. Create a Switch to determine what value of the planet is
        switch(myPlanet) {
        case EARTH:
            System.out.println("Yaaaaaaaaazzz slay, You can Live here!");
            System.out.println("This is planet #" + myPlanet.number);
            break;
        default:
            System.out.println("Naur! shooo! go away");
            System.out.println("This is planet #" + myPlanet.number);
            break;

        }

    }
}
