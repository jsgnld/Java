/* Jose Mari Aguinaldo
 * COMP 009 - Object-Oriented Programming
 * Quiz 1: Array
 */

public class Array {
    public static void main(String[] args) { // Start of the Main Program
        double[][][] objStockCard = {
            { // Current Balance
                {880001, 5000},
                {881342, 10000},
                {880022, 4500},
                {883499, 8970},
                {892745, 3622}
            },
            { // Receiving
                {880022, 1300},
                {880022, 600},
                {892745, 9000},
                {895333, 50000},
                {881342, 900}
            },
            { // Issuance
                {883499, 555},
                {880001, 1500},
                {880022, 703},
                {880001, 999},
                {883499, 970}
            }
        };

        int[] productIds = {880022, 883499, 892745};
        for (int id : productIds) {
            double balance = getBalanceForProduct(objStockCard, id);
            System.out.println("Product ID: " + (int) id + " Balance: " + balance);
        }
    }

public static double getBalanceForProduct(double[][][] objStockCard, int productId) {
        double balance = 0;

        // Calculate Current Balance
        for (double[] record : objStockCard[0]) {
            if (record[0] == productId) {
                balance = record[1];
            }
        }

        // Add Received Amount
        for (double[] record : objStockCard[1]) {
            if (record[0] == productId) {
                balance += record[1];
            }
        }

        // Subtract Issuance Amount
        for (double[] record : objStockCard[2]) {
            if (record[0] == productId) {
                balance -= record[1];
            }
        }
        return balance;
    } // public static void main(String[] args); End of the main program
} // public class InventoryBalance