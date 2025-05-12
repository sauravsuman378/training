package com.pivotree.training.ArrayExamples;

import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args) {
        int[]a = {100, 600, 200, 500, 400};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(a));
    }
}
