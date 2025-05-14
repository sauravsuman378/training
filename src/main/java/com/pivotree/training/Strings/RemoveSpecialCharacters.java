package com.pivotree.training.Strings;

public class RemoveSpecialCharacters {
    public static String removeSpecialCharacters(String input) {
        // Replace everything that is not a letter or digit with an empty string
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        String stringWithSpecialChars = "We$lc%^123ome";
        String stringWithoutSpecialChars = removeSpecialCharacters(stringWithSpecialChars);
        System.out.println("String without speical characters : " + stringWithoutSpecialChars);
    }
}

