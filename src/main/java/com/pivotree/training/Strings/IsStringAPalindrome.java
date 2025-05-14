package com.pivotree.training.Strings;

public class IsStringAPalindrome {
    public static void main(String[] args) {
        String s = "ABABA";
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        if(reverse.equals(s)){
            System.out.println("String is a Palindrome");
        }
        else{
            System.out.println("String is not a Palindrome");
        }
    }
}
