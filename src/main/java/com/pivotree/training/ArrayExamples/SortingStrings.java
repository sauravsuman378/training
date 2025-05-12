package com.pivotree.training.ArrayExamples;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {
        char [] c = {'D', 'C', 'B', 'A' };
        System.out.println("Before Sorting char array: " + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("After Sorting char array: " + Arrays.toString(c));

        String[] s = {"scott", "mary", "john", "david"};
        System.out.println("Before Sorting String array: " + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting String array: " + Arrays.toString(s));
    }
}
