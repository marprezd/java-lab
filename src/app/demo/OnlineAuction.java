package app.demo;

import javax.swing.JOptionPane; // Required for display an interactive input dialog.

/**
 * Program: OnlineAuction.java
 * Written by Mario Pérez
 * Date: 04-30-2022
 * 
 * This program that prompts the user a price maximum required for all bid, and
 * then continuously accepts auction data and displays data for every
 * auction in which the minimum bid is less than or equal to the
 * amount entered for all bid.
 */
public class OnlineAuction {
    public static void main(String[] args) {
        // Declaring a few variable.
        String idNumberString;
        int idNumber;
        double maximumPrice;
        // Initialize constant NEXT_AUCTION as a sentinel value.
        final int NEXT_AUCTION = 0;

        idNumberString = JOptionPane.showInputDialog("Enter the ID Number for this item.");
        idNumber = Integer.parseInt(idNumberString);

        // Call the getMaximumPriceBid method and assign the return value to
        // the maximumPrice variable.
        maximumPrice = getMaximumPriceBid();

        while (idNumber != NEXT_AUCTION) {
            // Call the getDetailsAuction method, passing the contents of
            // idNumber and maximumPrice as arguments.
            getDetailsAuction(idNumber, maximumPrice);

            // Prompts the user if he/she want enter for a new item data, or exit from
            // program.
            idNumberString = JOptionPane.showInputDialog("Enter next ID Number, or 0 for exit.");
            idNumber = Integer.parseInt(idNumberString);
        }
    }

    /**
     * The getDetailsAuction method
     * 
     * @param idNumber     The ID Number for each item.
     * @param maximumPrice The maximum price for all bid.
     */

    public static void getDetailsAuction(int idNumber, double maximumPrice) {
        // Declaring a few variable.
        String description;
        double priceBid;
        int daysAuction;

        description = JOptionPane.showInputDialog("Tell us something brief about the auction item.");

        // Call the getDaysAuction method and assign the return value to
        // the daysAuction variable.
        daysAuction = getDaysAuction();

        // Call the getPriceBid method and assign the return value to
        // the priceBid variable.
        priceBid = getPriceBid();

        // Display the data for every auction in which
        // the minimum bid is less than or equal to maximumPrice.
        if (priceBid <= maximumPrice) {
            System.out.println("ID Number Item: " + idNumber);
            System.out.println("Item description: " + description);
            System.out.println("Item auction in days: " + daysAuction);
            System.out.printf("Auction price (maximum): $%.2f\n", maximumPrice);
            System.out.printf("Auction price (by seller): $%.2f\n", priceBid);
            System.out.println("--------- ***** ---------");
        }
    }

    /**
     * The getMaximumPriceBid method.
     * 
     * @return The maximum price for all bid.
     */

    public static double getMaximumPriceBid() {
        String priceString;
        double price; // Holds the maximum price for all bid.

        priceString = JOptionPane.showInputDialog("How many is the maximum price for all bid?");
        // Converts the value entered by users to a double value and assigns it to the
        // price variable
        price = Double.parseDouble(priceString);

        // Return the value in the price variable
        return price;
    }

    /**
     * The getPriceBid method.
     * 
     * @return The price for a bid.
     */

    public static double getPriceBid() {
        String priceString;
        double price; // Holds the price by bid.

        priceString = JOptionPane.showInputDialog("How many is your price for this bid?");
        // Converts the value entered by users to a double value and assigns it to the
        // price variable.
        price = Double.parseDouble(priceString);

        // Return the value in the price variable.
        return price;
    }

    /**
     * The getDaysAuction method.
     * 
     * @return The length of auction in days.
     */

    public static int getDaysAuction() {
        String daysAuctionString;
        int daysAuction; // Holds auction in days.

        daysAuctionString = JOptionPane.showInputDialog("How many days will this article be auction?");
        // Converts the value entered by users to a decimal integer and assigns it to
        // the daysAuction variable.
        daysAuction = Integer.parseInt(daysAuctionString);

        // Return the value in the daysAuction.
        return daysAuction;
    }
}
