package com.pivotree.training.ArrayExamples;

import java.util.Arrays;

public class StudentMarksSystem {
    public static void main(String[] args) {
        String[] students = {"Student1", "Student2", "Student3"};
        String[] subjects = {"Math", "Science", "English", "Chemistry"};

        int[][] marks = {
                {85, 90, 78, 92},   // Student1
                {76, 88, 70, 80},   // Student2
                {90, 85, 85, 88}    // Student3
        };
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
