package com.pivotree.training.Strings;

import java.util.ArrayList;

public class CountOccurenceOfCharacterInString {
    public static void main(String[] args) {
        String s= "aababcbabbabccccab";
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
