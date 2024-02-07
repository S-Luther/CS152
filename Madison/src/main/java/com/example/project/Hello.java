package com.example.project;

public class Hello {

    // you need a main method //

    static String[][] GoBoard = new String[19][19];

    public static void main(String[] args) {

        for (int i = 0; i < GoBoard.length; i++) {
            // handles columns of board (19)

            for (int j = 0; j < GoBoard[i].length; j++) {
                GoBoard[i][j] = " ";
                System.out.print(" + ");
      
            }
        }

    }
}
