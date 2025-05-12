package com.pivotree.training;

import java.util.Scanner;

public class SalesTrackingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sales = new double[7];  // Array to store sales for 7 days
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Input sales for each day
        System.out.println("Enter sales for each day of the week:");
        for (int i = 0; i < 7; i++) {
            System.out.print(days[i] + ": Rs.");
            sales[i] = sc.nextDouble();
        }
        double maxSales = sales[0];
        int maxDayIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxDayIndex = i;
            }
        }
        System.out.println("Highest sales were on " + days[maxDayIndex] + ": Rs." + maxSales);
    }
}

