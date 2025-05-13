package com.pivotree.training.ArrayExamples;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7};
        int n = 7;

        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("missing number: " + (total - sum));
    }
}