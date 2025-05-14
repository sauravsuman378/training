package com.pivotree.training.Strings;

import java.util.Scanner;

public class EncryptedPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
        stringBuilder.reverse();
        System.out.println("Encrypted Password : " + stringBuilder);
    }
}
