package JAVA.Practice3;

import java.util.*; 
// Importing Java's utility package for using classes like Scanner to take user input.

abstract class Account { 
    // Defining an abstract class `Account` as a blueprint for specific account types.

    private int accNumber; 
    // Stores the account number, private for encapsulation.

    private String accHolder; 
    // Stores the name of the account holder, private for encapsulation.

    private double balance; 
    // Stores the current balance in the account, private for encapsulation.

    public int getAccNumber() { return accNumber; } 
    // Getter for retrieving the account number.

    public void setAccNumber(int accNumber) { 
        this.accNumber = accNumber; } 
    // Setter for setting the account number.

    public String getAccHolder() { 
        return accHolder; } 
    // Getter for retrieving the account holder's name.

    public void setAccHolder(String accHolder) { 
        this.accHolder = accHolder; } 
    // Setter for setting the account holder's name.

    public double getBalance() { 
        return balance; } 
    // Getter for retrieving the account balance.

    public void setBalance(double balance) { 
        this.balance = balance; } 
    // Setter for setting the account balance.

    abstract double deposit(double amount); 
    // Abstract method for depositing money, to be defined by subclasses.

    abstract double withdraw(double amount); 
    // Abstract method for withdrawing money, to be defined by subclasses.
}

class SavingsAccount extends Account { 
    // Subclass `SavingsAccount` extends the abstract class `Account`.

    @Override
    double withdraw(double amount) { 
        // Implementation of the withdraw method for a savings account.
        if (amount <= 5000) { 
            // Check if the withdrawal amount is within the allowed limit.
            return 0; 
            // Returning 0 indicates the transaction was not allowed.
        } else {
            double newBalance = getBalance() - amount; 
            // Calculates the new balance after withdrawal.
            return newBalance; 
        }
    }

    @Override
    double deposit(double amount) { 
        // Implementation of the deposit method for a savings account.
        double pastBalance = getBalance(); 
        // Retrieves the current balance.
        double newBalance = pastBalance + amount; 
        // Calculates the new balance after deposit.
        return newBalance; 
    }
}

class CheckingAccount extends Account { 
    // Subclass `CheckingAccount` extends the abstract class `Account`.

    @Override
    double withdraw(double amount) { 
        // Implementation of the withdraw method for a checking account.
        if (amount <= 10000) { 
            // Check if the withdrawal amount is within the allowed limit.
            return 0; 
        } else {
            double newBalance = getBalance() - amount; 
            // Calculates the new balance after withdrawal.
            return newBalance; 
        }
    }

    @Override
    double deposit(double amount) { 
        // Implementation of the deposit method for a checking account.
        double pastBalance = getBalance(); 
        double newBalance = pastBalance + amount; 
        return newBalance; 
    }
}

public class MyBankAccount1 { 
    // Main class to handle user interactions.

    public static void main(String[] args) { 
        // Main method is the entry point of the program.

        Scanner sc = new Scanner(System.in); 
        // Creates a Scanner object to take input from the user.

        System.out.print("1. Savings Account\n" +
                         "2. Checking Account\n" +
                         "Enter choice: "); 
        // Display menu options for the user to choose an account type.
        int choice = sc.nextInt(); 
        // Takes the user's choice.

        switch (choice) { 
            // Determines which account type to create based on the user's choice.

            case 1:
                SavingsAccount s1 = new SavingsAccount(); 
                // Creates an instance of `SavingsAccount`.

                s1.setAccNumber(1234567); 
                // Sets the account number.
                System.out.print("Account Number: "); 
                System.out.println(s1.getAccNumber()); 
                // Prints the account number.

                s1.setAccHolder("Fernando Lopez Jr."); 
                System.out.print("Account Holder: "); 
                System.out.println(s1.getAccHolder()); 
                // Prints the account holder's name.

                s1.setBalance(32046.87); 
                System.out.print("Balance: "); 
                System.out.println(s1.getBalance()); 
                // Prints the current balance.

                System.out.print("Withdraw(1) or Deposit(2)\n" + "Enter choice: "); 
                // Prompts the user for the next operation.
                int choice1 = sc.nextInt(); 

                if (choice1 == 1) { 
                    System.out.print("Enter amount to withdraw: "); 
                    double amount = sc.nextDouble(); 

                    System.out.print("New Balance: "); 
                    if (s1.withdraw(amount) == 0) { 
                        // Checks if the withdrawal was denied due to limits.
                        System.out.print("Withdrawal limit is 5000. Try smaller.");
                    } else {
                        System.out.println(s1.withdraw(amount)); 
                        // Displays the new balance after withdrawal.
                    }
                } else if (choice1 == 2) { 
                    // Handles deposit operation.
                    System.out.print("Enter amount to deposit: "); 
                    double amount = sc.nextDouble(); 
                    System.out.print("New Balance: "); 
                    System.out.println(s1.deposit(amount)); 
                    // Displays the new balance after deposit.
                } else {
                    System.out.print("Invalid"); 
                    // Displays error for invalid input.
                }

                System.out.println("\n"); 
                break;

            case 2:
                CheckingAccount c1 = new CheckingAccount(); 
                // Creates an instance of `CheckingAccount`.

                c1.setAccNumber(24567); 
                System.out.print("Account Number: "); 
                System.out.println(c1.getAccNumber()); 

                c1.setAccHolder("Lopez Fernando"); 
                System.out.print("Account Holder: "); 
                System.out.println(c1.getAccHolder()); 

                c1.setBalance(56342.56); 
                System.out.print("Balance: "); 
                System.out.println(c1.getBalance()); 

                System.out.print("Withdraw(1) or Deposit(2)\n" + "Enter choice: "); 
                int choice2 = sc.nextInt(); 

                if (choice2 == 1) { 
                    System.out.print("Enter amount to withdraw: "); 
                    double amount = sc.nextDouble(); 

                    System.out.print("New Balance: "); 
                    if (c1.withdraw(amount) == 0) { 
                        System.out.print("Withdrawal limit is 10000. Try smaller.");
                    } else {
                        System.out.println(c1.withdraw(amount)); 
                    }
                } else if (choice2 == 2) { 
                    System.out.print("Enter amount to deposit: "); 
                    double amount = sc.nextDouble(); 
                    System.out.print("New Balance: "); 
                    System.out.println(c1.deposit(amount)); 
                } else {
                    System.out.print("Invalid"); 
                }
                break;
        }
    }
}