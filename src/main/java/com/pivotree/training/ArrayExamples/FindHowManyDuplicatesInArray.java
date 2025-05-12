package com.pivotree.training.ArrayExamples;

public class FindHowManyDuplicatesInArray {
    public static void main(String[] args) {
        int[] a= {100,200,300,400,500, 100, 600, 100};
        int num = 100;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
