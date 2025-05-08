package com.pivotree.training;

import java.util.Scanner;

public class RaceEventResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input times for both athletes
        System.out.print("Enter time (in seconds) for Athlete 1: ");
        double timeAthlete1 = sc.nextDouble();

        System.out.print("Enter time (in seconds) for Athlete 2: ");
        double timeAthlete2 = sc.nextDouble();

        // Compare times using if-else
        if (timeAthlete1 < timeAthlete2) {
            System.out.println("Athlete 1 completed the race faster than Athlete 2");
        } else if (timeAthlete2 < timeAthlete1) {
            System.out.println("Athlete 2 completed the race faster than Athlete 1");
        } else {
            System.out.println("It's a tie. Both athletes finished race at the same time.");
        }

        sc.close();
    }
}

