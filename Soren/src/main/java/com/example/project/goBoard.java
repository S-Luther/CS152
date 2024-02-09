package com.example.project;

public class goBoard {

    static String Board[][] = new String[19][19];

    public static void main(String[] args) {
        //Looking Good, but you still need to place a couple pieces on the board.
        //You can do this by calling Board[8][9] = "●";
        //But don't forget that yo uare overwriting everything in the loop below.
        
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                Board[i][j] = "+";
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
    }
}
