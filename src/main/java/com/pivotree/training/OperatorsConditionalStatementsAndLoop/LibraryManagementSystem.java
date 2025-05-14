package com.pivotree.training.OperatorsConditionalStatementsAndLoop;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Book Details
        String bookTitle = "Wings of Fire";
        String authorName = "Dr. A.P.J. Abdul Kalam";
        int publicationYear = 1999;
        double bookPrice =499.00;
        boolean isAvailable = true;

        // Members Details
        String memberName = "Saurav Suman";
        int memberId = 201;
        char membershipType = 'A'; // A = Adult, C = Child, S = Senior

        // Borrowing Status
        int daysBorrowed = 10;
        double finePerExtraDay = 2.50;
        int freeDays = 3;
        int extraDays = Math.max(0, daysBorrowed - freeDays);
        double totalFine = extraDays * finePerExtraDay;

        // Output
        System.out.println("Library Management System");
        System.out.println("\n Book Details");
        System.out.println("Title of the book: " + bookTitle);
        System.out.println("Author of the book: " + authorName);
        System.out.println("Year of Publication: " + publicationYear);
        System.out.println("Price: Rs." + bookPrice);
        System.out.println("Available: " + "Yes");

        System.out.println("\n Member Details");
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
        System.out.println("Membership Type: " + membershipType);

        System.out.println("\nBorrowing Status");
        System.out.println("Days Borrowed: " + daysBorrowed);
        System.out.println("Free Days: " + freeDays);
        System.out.println("Fine Per Extra Day: Rs." + finePerExtraDay);
        System.out.println("Total Fine: Rs." + totalFine);
    }
}
