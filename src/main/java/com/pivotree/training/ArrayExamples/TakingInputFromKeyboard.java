package com.pivotree.training.ArrayExamples;

import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Given number : " + num);

        System.out.println("Enter a decimal number : ");
        double dec = sc.nextDouble();
        System.out.println("Given decimal number : " + dec);

        System.out.println("Enter a city : ");
        String city = sc.next();
        System.out.println("Given city : " + city);
    }
}

