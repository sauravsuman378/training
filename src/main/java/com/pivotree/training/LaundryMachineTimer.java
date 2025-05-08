package com.pivotree.training;

public class LaundryMachineTimer {

    public static void main(String[] args) {
        int minute = 1;
        int totalMinutes = 5;
        while (minute <= totalMinutes) {
            System.out.println("Washing Minute: " + minute);
            minute++;
        }
        System.out.println("Washing complete!");
    }
}
