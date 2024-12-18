package Draft;

// Aguinaldo, Jose Mari R.
// BSCS 3-1
// Date: 10/15/21

// Latte.java
class Latte extends Coffee {
    // Overriding the brew method from the Coffee class
    // to simulate brewing a latte instead of a regular coffee
    @Override
        void brew() {
        System.out.println("Brewing a delicious latte.");
    }
}