public abstract class Person { // if class isn't abstract, can't declare abstract methods
    // void makeSound() {
    //     System.out.println("Person1 is making a sound.");
    // }
    String name;

    abstract void makeSound();

    // If we declare this, the subclasses (Boy and Girl) must implement this method
    abstract void Whisperers();

    // Can still make methods that are not abstract inside the abstract class
    void Showname() {
        System.out.println("The name is " + name);
    }

    // Setter
    void setName(String name) {
        this.name = name;
    }
}
