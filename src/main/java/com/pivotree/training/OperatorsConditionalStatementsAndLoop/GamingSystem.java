package com.pivotree.training.OperatorsConditionalStatementsAndLoop;

public class GamingSystem {

    public static void main(String[] args) {

        for (int level = 1; level <= 10; level++) {
            if (level == 3) {
                System.out.println("Skipping the level " + level + " as it is locked or under maintenance.");
                continue;
            }
            if (level == 6) {
                System.out.println("Player eliminated at Level " + level );
                break;
            }
            System.out.println("Player completed Level " + level);
        }
    }
}

