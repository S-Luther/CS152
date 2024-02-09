package com.example.project;
import java.util.Scanner;
/*
 * 
 * This is looking great! 
 * Excellent Job Sydney!
 * 
 */

public class Hello {
    // go pieces ◯ ●
    static String[][] goBoard = new String[9][9];
    // keep track of what pieces are white or black
    static String white = "◯";
    static String black = "●";

    public static void main(String[] args) {
        goBoard[3][3] = white;
        goBoard[3][2] = black;
        System.out.println("  1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < goBoard[0].length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < goBoard[i].length; j++) {
                if (goBoard[i][j] == null) {
                    System.out.print("—|—");

                } else {
                    System.out.print("—" + goBoard[i][j] + "—");
                }

                // The else statement should be used to print the pieces

            }
            // Will make a new row at the end of each j itteration
            System.out.println();
        }
        // cases can be stacked, don't put a switch staement into another switch
        // statement
        // can't have logical operators in cases, won't run expressions within the cases
        // themselves
        System.out.println("Enter x coordinate for your piece:")


    }
}