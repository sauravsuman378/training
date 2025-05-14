package com.pivotree.training.Strings;

public class ReverseString {
    public static void main(String[] args) {

        //Approach 1 -
        String s = "welcome";
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);

        //Approach 2 - without using String methods
        String s1 = "selenium";
        String reverse1 = "";
        char[] chars = s1.toCharArray();
        for(int i = s1.length() - 1; i >= 0; i--){
            reverse1 = reverse1 + chars[i];
        }
        System.out.println(reverse1);

        //Approach 3 - using StringBuilder
        String s2 = "abcd";
        StringBuilder stringBuilder = new StringBuilder(s2);
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());


        //Approach 4 - using StringBuffer

        StringBuffer stringBuffer = new StringBuffer("abcde");
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
    }
}
