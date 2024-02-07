package com.example.project;

public class Hello {
    // go pieces ◯ ●
    static String[][] goBoard = new String[9][9];
    // keep track of what pieces are white or black
    static String white = "◯";
    static String black = "●";

    public static void main(String[] args) {
        goBoard[3][3] = white;
        goBoard[3][2] = black;
        for (int i = 0; i < goBoard[0].length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                if (goBoard[i][j] == null) {
                    System.out.print("-|-");

                }
                // You need to add you println in the outermost loop
                // else {
                // System.out.println();
                // }
                else {
                    System.out.print("-" + goBoard[i][j] + "-");
                }

                // The else statement should be used to print the pieces

            }
            // Will make a new row at the end of each j itteration
            System.out.println();

        }
        // cases can be sacked, don't put a switch staement into another switch statement
        // can't have logical operators in  cases, won't run exprssions within the cases themselves

    }
}