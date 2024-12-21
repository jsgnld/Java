/* Aguinaldo, Jose Mari R. | BSCS -1 */
/* Polymorphism - Method Overriding */

package JAVA.OOP.Polymorphism.Overriding;

import java.util.Scanner;

class Book {
    public void send() {
        System.out.println("A generic book is being sent.");
    }
}

class Library extends Book {
    @Override
    public void send() {
        System.out.println("Reading a book from the library...");
    }
}

class DigitalBook extends Book {
    @Override
    public void send() {
        System.out.println("Downloading an eBook...");
    }
}

class AudioBook extends Book {
    @Override
    public void send() {
        System.out.println("Streaming an audiobook...");
    }
}

public class BookDeliverySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a type of book to interact with:");
        System.out.println("1. Library Book");
        System.out.println("2. Digital Book");
        System.out.println("3. Audio Book");

        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        // Declare a reference of type Book
        Book book;

        // Instantiate the appropriate subclass based on user input
        switch (choice) {
            case 1:
                book = new Library();
                break;
            case 2:
                book = new DigitalBook();
                break;
            case 3:
                book = new AudioBook();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to a generic book.");
                book = new Book();
        }

        book.send();

        scanner.close();
    }
}