package com.pivotree.training.ArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter 5 elements for position i: " + i);
            a[i] = sc.nextInt();
        }
        System.out.println("printing array elements:");
        System.out.println(Arrays.toString(a));
    }
}
