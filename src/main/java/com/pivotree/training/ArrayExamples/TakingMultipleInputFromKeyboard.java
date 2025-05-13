package com.pivotree.training.ArrayExamples;

import java.util.Scanner;

public class TakingMultipleInputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum of both numbers: " + num1 + num2);
    }
}
