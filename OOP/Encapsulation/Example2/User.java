package JAVA.OOP.Encapsulation.Example2;
public class User {
    
    private int userID; // Sentitive data
    private String userName; // Sentitive data
    String firstName, lastName;

    // Constrtuctor
    User(int userID, String userName, String firstName, String lastName) {
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // // Setters - setting values
    // void setUserID(int userID) {
    //     this.userID = userID;
    // }
    // Getters - getting values
    int getUserID() {
        return userID;
    }
    // Read and Write only
    String getUserName() {
        return userName;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Getters
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
}