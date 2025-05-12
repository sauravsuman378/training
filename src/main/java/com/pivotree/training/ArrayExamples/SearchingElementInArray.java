package com.pivotree.training.ArrayExamples;

public class SearchingElementInArray {
    public static void main(String[] args) {
        int[] a =  {10, 20, 30, 40, 50};
        int searchedElement = 70;

        boolean foundStatus = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchedElement) {
                System.out.println("Element found at index " + i);
                foundStatus = true;
                break;
            }

        }
        if (!foundStatus) {
            System.out.println("Element not found");
        }

    }
}
