package com.example.project;

public class Hello {

    // you need a main method //

    static String[][] GoBoard = new String[9][9];

    static String white = "◯";
    static String black = "●";

    int num = 1;

    public static void main(String[] args) {

        for (int i = 0; i < GoBoard.length; i++) {
            // handles columns of board (19)

            for (int j = 0; j < GoBoard[i].length; j++) {
                GoBoard[i][j] = " ";
                System.out.print("-|");

            }
            System.out.println();
            // You need to add a newline here to make it tabular
            // You should add System.out.println();
            
            // how would I add the numbers along the top and side?
            //if I was trying to use a counter (num)?
        }

    }
}
