// Enumerated type = enum: ordered listing of items in a collection

enum Planet {
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, NERPTUNE, PLUTO;
}
public class Enum1 {
    
    public static void main(String[] args) {
        
        // 1. Instantiate an instance (can change)
        Planet myPlanet = Planet.MARS;

        // 4. Call the function
        canILiveHere(myPlanet);
    }

    // 2. Create a Method
    static void canILiveHere(Planet myPlanet) {

        // 3. Create a Switch to determine what value of the planet is
        switch(myPlanet) {
        case EARTH:
            System.out.println("Yaaaaaaaaazzz slay, You can Live here!");
            break;
        default:
            System.out.println("Naur! shooo! go away");
            break;

        }

    }
}