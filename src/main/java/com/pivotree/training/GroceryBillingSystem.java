package com.pivotree.training;

public class GroceryBillingSystem {

    public static void main(String[] args) {

        // Sample item data
        double itemPrice = 400.0;  // price per item in Rs.
        int quantity = 20;

        // Unary operator
        quantity++;

        // Arithmetic operator
        double subtotal = itemPrice * quantity;

        // Ternary operator
        double discount = (subtotal > 1000) ? subtotal * 0.10 : 0;

        // Assignment operator
        double totalAmount = subtotal - discount;

        // Relational & Logical operators
        boolean isEligibleForFreeGift = (totalAmount > 1000) && (quantity > 5);

        // Output the billing summary.
        System.out.println("Grocery Store Bill");
        System.out.println("Item Price: Rs." + itemPrice);
        System.out.println("Quantity Purchased: " + quantity);
        System.out.println("Subtotal: Rs." + subtotal);
        System.out.println("Discount Applied: Rs." + discount);
        System.out.println("Total Payable: Rs" + totalAmount);
        System.out.println("Free Gift Eligibility: " + (isEligibleForFreeGift ? "Yes" : "No"));

    }
}
